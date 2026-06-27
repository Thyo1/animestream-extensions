package com.nomat

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin

@AnimeStreamPlugin
class NomatProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(NomatProvider())
        registerExtractorAPI(Hydrax())
    }
}
