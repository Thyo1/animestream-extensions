package com.layarkaca

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class LayarKacaPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(LayarKacaProvider())
        registerExtractorAPI(EmturbovidExtractor())
        registerExtractorAPI(P2PExtractor())
        registerExtractorAPI(F16Extractor())
    }
}
