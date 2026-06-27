package com.hexated

// PERBAIKAN: Mengubah import agar sinkron dengan anotasi @AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class NimegamiPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Nimegami())
        registerExtractorAPI(DlganExtractor())
        registerExtractorAPI(BerkasDriveExtractor())
    }
}
