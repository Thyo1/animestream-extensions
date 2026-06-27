package com.hexated

// PERBAIKAN: Mengubah import agar sinkron dengan anotasi @AnimeStreamPlugin
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class NimegamiPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Nimegami())
        registerExtractorAPI(DlganExtractor())
        registerExtractorAPI(BerkasDriveExtractor())
    }
}
