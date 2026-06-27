package com.layarasia

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin


@AnimeStreamPlugin
class LayarasiaProviderPlugin : Plugin() {
    override fun load(context: Context) {
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
