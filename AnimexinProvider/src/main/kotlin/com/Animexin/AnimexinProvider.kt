package com.Animexin

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.extractors.Dailymotion

@AnimeStreamPlugin
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