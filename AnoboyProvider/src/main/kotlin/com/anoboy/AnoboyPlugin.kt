package com.anoboy

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin


@AnimeStreamPlugin
class AnoboyPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(Anoboy())
        registerExtractorAPI(BloggerExtractor())
    }
}
