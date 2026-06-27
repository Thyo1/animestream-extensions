package com.cinemax21

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin  
class Cinemax21ProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(Cinemax21Provider())
        registerExtractorAPI(Jeniusplay())
    }
}
