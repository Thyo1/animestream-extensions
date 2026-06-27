package com.drakor

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin
class DrakorProviderPlugin : BasePlugin() {
    override fun load(context: Context) {
        registerMainAPI(DrakorProvider())
        registerExtractorAPI(Jeniusplay())
    }
}
