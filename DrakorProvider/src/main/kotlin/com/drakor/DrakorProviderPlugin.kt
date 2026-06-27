package com.drakor

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class DrakorProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(DrakorProvider())
        registerExtractorAPI(Jeniusplay())
    }
}
