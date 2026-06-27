package com.layarasia

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin


@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin  
class LayarasiaProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(LayarasiaProvider())
        registerExtractorAPI(Smoothpre())
        registerExtractorAPI(EmturbovidExtractor())
        registerExtractorAPI(BuzzServer())
        registerExtractorAPI(Nunaupns())
        registerExtractorAPI(Nunap2p())
        registerExtractorAPI(Dingtezuni())
        registerExtractorAPI(Minochinos())
    }
}
