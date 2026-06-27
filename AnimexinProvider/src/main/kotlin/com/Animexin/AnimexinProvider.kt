package com.Animexin

import com.thyo.animestream.plugins.BasePlugin
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.extractors.Dailymotion

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin
class AnimexinProvider: BasePlugin() {
    override fun load() {
        registerMainAPI(Animexin())
        registerExtractorAPI(Vtbe())
        registerExtractorAPI(waaw())
        registerExtractorAPI(wishfast())
        registerExtractorAPI(FileMoonSx())
        registerExtractorAPI(Dailymotion())
    }
}