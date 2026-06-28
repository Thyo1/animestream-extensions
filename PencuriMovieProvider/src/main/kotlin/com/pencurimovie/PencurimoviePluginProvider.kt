package com.pencurimovie

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin
class PencurimoviePluginProvider: BasePlugin() {
    override fun load() {
        registerMainAPI(PencurimovieProvider())
        registerExtractorAPI(Dsvplay())
        registerExtractorAPI(Hglink())
    }
}
