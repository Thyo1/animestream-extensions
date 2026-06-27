package com.oppadrama

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin


@AnimeStreamPlugin
class OppadramaProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(OppadramaProvider())
        registerExtractorAPI(Smoothpre())
        registerExtractorAPI(EmturbovidExtractor())
        registerExtractorAPI(BuzzServer())
    }
}
