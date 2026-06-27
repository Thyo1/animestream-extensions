package com.klikxxi

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin
class KlikxxiProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(KlikxxiProvider())
        registerExtractorAPI(Klixxistrp2p())
        registerExtractorAPI(Klixxiupns())
        registerExtractorAPI(Hglink())  
    }
}
