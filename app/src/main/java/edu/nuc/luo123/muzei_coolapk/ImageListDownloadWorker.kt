package edu.nuc.luo123.muzei_coolapk

import android.content.Context
import android.net.Uri
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.google.android.apps.muzei.api.provider.Artwork
import com.google.android.apps.muzei.api.provider.ProviderContract
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.Exception

class ImageListDownloadWorker(appContext: Context, workerParameters: WorkerParameters) :
    Worker(appContext, workerParameters) {
    private val client by lazy { CoolApkAPI.getClient() }
    private val api by lazy { client.create<CoolApkAPI>(CoolApkAPI::class.java) }
    private val page = workerParameters.inputData.getInt("page", 1)
    private var type = workerParameters.inputData.getString("type") ?: ""
    private var rank = workerParameters.inputData.getString("rank") ?: ""
    private val only2k = workerParameters.inputData.getBoolean("only_2k", false)
    private val onlyPhone = workerParameters.inputData.getBoolean("only_phone", true)

    @RequiresApi(Build.VERSION_CODES.O)
    override fun doWork(): Result {
        if (type == "不限") {
            type = ""
            rank = ""
        }
        api.getImageList(CoolApkAPI.signature(), type, rank, page)
            .enqueue(object : Callback<ImageListEntity> {
                override fun onFailure(call: Call<ImageListEntity>, t: Throwable) {
                    Toast.makeText(
                        applicationContext,
                        "获取壁纸失败${t.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onResponse(
                    call: Call<ImageListEntity>,
                    response: Response<ImageListEntity>
                ) {
                    if (!response.isSuccessful) {
                        Toast.makeText(
                            applicationContext,
                            "获取壁纸失败${response.message()}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    val client =  ProviderContract.getProviderClient(
                        applicationContext,
                        WallpaperProvider::class.java
                    )

                    for (d in response.body()?.data!!) {
                        for (picUrl in d.picArr) {
                            val parts = picUrl.split("@")
                            if (parts.size != 2) {
                                continue
                            }
                            val parts2 = parts[1].split(".")
                            if (parts2.size != 2) {
                                continue
                            }
                            val imgResolution = parts2[0]
                            val resolution = imgResolution.split("x")
                            if (resolution.size != 2) {
                                continue
                            }
                            try {
                                val xSize = resolution[0].toInt()
                                val ySize = resolution[1].toInt()

                                if (only2k) {
                                    if (xSize < 1440 || ySize < 1440) {
                                        continue
                                    }
                                }
                                if (onlyPhone) {
                                    if (xSize >= ySize) {
                                        continue
                                    }
                                }
                            } catch (e: Exception) {
                                continue
                            }
                            client.addArtwork(
                                Artwork.Builder()
                                    .token(d.id)
                                    .persistentUri(Uri.parse(picUrl))
                                    .attribution(d.tags)
                                    .webUri(Uri.parse(picUrl))
                                    .build()
                            )
                        }
                    }
                }
            })
        return Result.success()
    }

}