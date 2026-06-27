package com.nomat

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin 
class NomatProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(NomatProvider())
        registerExtractorAPI(Hydrax())
    }
}
