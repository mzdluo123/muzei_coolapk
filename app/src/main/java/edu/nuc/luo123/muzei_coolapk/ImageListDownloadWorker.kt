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
import java.lang.Exception

class ImageListDownloadWorker(appContext: Context, workerParameters: WorkerParameters) :
    Worker(appContext, workerParameters) {
    private val client by lazy { CoolApkAPI.getClient() }
    private val api by lazy { client.create<CoolApkAPI>(CoolApkAPI::class.java) }
    private val page = workerParameters.inputData.getInt("page", 1)
    private var type = workerParameters.inputData.getString("type") ?: ""
    private var rank = workerParameters.inputData.getString("rank") ?: ""
    private val only2k = workerParameters.inputData.getBoolean("only_2k", false)

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
                        val parts = d.label.split("x")
                        if (parts.size < 2) {
                            continue
                        }
                        if (only2k) {
                            try {
                                if (parts[0].toInt() < 1440 || parts[1].toInt() < 1440) {
                                    continue
                                }
                            } catch (e: Exception) {
                                continue
                            }
                        }
                        for (url in d.picArr){
                            client.addArtwork(
                                Artwork.Builder()
                                    .token(d.id)
                                    .persistentUri(Uri.parse(url))
                                    .attribution(d.tags)
                                    .webUri(Uri.parse(url))
                                    .build()
                            )

                        }
                    }
                }
            })
        return Result.success()
    }

}