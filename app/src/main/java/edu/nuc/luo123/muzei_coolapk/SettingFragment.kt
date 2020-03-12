package edu.nuc.luo123.muzei_coolapk

import android.os.Bundle
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.google.android.apps.muzei.api.provider.ProviderContract

class SettingFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.prefrences, rootKey)

        val listener =
            Preference.OnPreferenceChangeListener { preference, newValue ->
                ProviderContract.getProviderClient(
                    this@SettingFragment.context?.applicationContext!!,
                    WallpaperProvider::class.java
                ).also {
                    it.setArtwork(mutableListOf())
                }
                true
            }
        preferenceManager.findPreference<ListPreference>("image_type")!!.onPreferenceChangeListener = listener
        preferenceManager.findPreference<ListPreference>("image_rank")!!.onPreferenceChangeListener = listener
    }

}