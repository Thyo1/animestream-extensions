package com.drakor

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin
class DrakorProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(DrakorProvider())
        registerExtractorAPI(Jeniusplay())
    }
}
