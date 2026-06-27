package com.oppadrama

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin


@AnimeStreamPlugin
class OppadramaProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(OppadramaProvider())
        registerExtractorAPI(Smoothpre())
        registerExtractorAPI(EmturbovidExtractor())
        registerExtractorAPI(BuzzServer())
    }
}
