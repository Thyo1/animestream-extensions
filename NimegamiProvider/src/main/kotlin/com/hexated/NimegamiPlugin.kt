package com.hexated

// PERBAIKAN: Mengubah import agar sinkron dengan anotasi @AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin 
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin 
class NimegamiPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(Nimegami())
        registerExtractorAPI(DlganExtractor())
        registerExtractorAPI(BerkasDriveExtractor())
    }
}
