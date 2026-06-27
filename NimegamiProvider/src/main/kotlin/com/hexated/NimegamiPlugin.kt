package com.hexated

// PERBAIKAN: Mengubah import agar sinkron dengan anotasi @AnimeStreamPlugin
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin
class NimegamiPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(Nimegami())
        registerExtractorAPI(DlganExtractor())
        registerExtractorAPI(BerkasDriveExtractor())
    }
}
