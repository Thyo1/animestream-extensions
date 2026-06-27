package com.anoboy

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin


@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin 
class AnoboyPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(Anoboy())
        registerExtractorAPI(BloggerExtractor())
    }
}
