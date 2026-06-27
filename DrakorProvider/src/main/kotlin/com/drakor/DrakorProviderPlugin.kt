package com.drakor

import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class DrakorProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(DrakorProvider())
        registerExtractorAPI(Jeniusplay())
    }
}
