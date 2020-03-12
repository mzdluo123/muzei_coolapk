package edu.nuc.luo123.muzei_coolapk

import android.os.Build
import android.preference.PreferenceManager
import androidx.annotation.RequiresApi
import androidx.work.Data
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.google.android.apps.muzei.api.provider.Artwork
import com.google.android.apps.muzei.api.provider.MuzeiArtProvider

class WallpaperProvider : MuzeiArtProvider() {
    var page = 1


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onLoadRequested(initial: Boolean) {
        this.context?.let {
            val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(it)

            if (initial) {
                page = 1
            }
             val lastWorkRequest = OneTimeWorkRequestBuilder<ImageListDownloadWorker>().setInputData(
                Data.Builder()
                    .putInt("page", page)
                    .putString("type", sharedPreferences.getString("image_type", "二次元"))
                    .putString("rank", sharedPreferences.getString("image_rank", "hot"))
                    .build()
            ).build()
            WorkManager.getInstance(it).enqueue(lastWorkRequest)
            page++
        }

    }


    override fun getDescription(): String {
        return "酷安的酷图壁纸源"
    }

    override fun onCommand(artwork: Artwork, id: Int) {
        super.onCommand(artwork, id)
    }

}
