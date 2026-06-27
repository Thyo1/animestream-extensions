package com.oppadrama

import android.content.Context
import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin


@AnimeStreamPlugin
class OppadramaProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(OppadramaProvider())
        registerExtractorAPI(Smoothpre())
        registerExtractorAPI(EmturbovidExtractor())
        registerExtractorAPI(BuzzServer())
    }
}
