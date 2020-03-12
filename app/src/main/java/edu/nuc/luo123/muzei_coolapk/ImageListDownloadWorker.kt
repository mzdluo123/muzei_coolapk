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

class ImageListDownloadWorker(appContext: Context, workerParameters: WorkerParameters) :
    Worker(appContext, workerParameters) {
    private val client by lazy { CoolApkAPI.getClient() }
    private val api by lazy { client.create<CoolApkAPI>(CoolApkAPI::class.java) }
    private val page = workerParameters.inputData.getInt("page", 1)
    private var type = workerParameters.inputData.getString("type") ?: ""
    private var rank = workerParameters.inputData.getString("rank") ?: ""

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

                    val artworks = mutableListOf<Artwork>()
                    response.body()?.data?.forEach { d ->

                        artworks.add(
                            Artwork.Builder()
                                .title(d.title)
                                .token(d.id)
                                .persistentUri(Uri.parse(d.picArr[0]))
                                .attribution(d.tags)
                                //.byline(d.message)
                                .webUri(Uri.parse(d.url))
                                .build()
                        )
                    }

                    ProviderContract.getProviderClient(
                        applicationContext,
                        WallpaperProvider::class.java
                    ).addArtwork(artworks)
                }
            })
        return Result.success()
    }

}