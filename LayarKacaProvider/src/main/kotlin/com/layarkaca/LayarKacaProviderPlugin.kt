package com.layarkaca

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin 
class LayarKacaPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(LayarKacaProvider())
        registerExtractorAPI(EmturbovidExtractor())
        registerExtractorAPI(P2PExtractor())
        registerExtractorAPI(F16Extractor())
    }
}
