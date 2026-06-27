package com.nomat

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin

@AnimeStreamPlugin
class NomatProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(NomatProvider())
        registerExtractorAPI(Hydrax())
    }
}
