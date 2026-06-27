package com.moviebox

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin  
class MovieboxProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(MovieboxProvider())
    }
}
