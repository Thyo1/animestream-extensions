package com.javhey

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin // <--- PENTING: Ini class induknya
import android.content.Context

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin  
class JavHeyProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(JavHeyProvider())
    }
}
