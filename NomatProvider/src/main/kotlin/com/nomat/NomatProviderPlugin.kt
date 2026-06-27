package com.nomat

import android.content.Context
import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@AnimeStreamPlugin
class NomatProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(NomatProvider())
        registerExtractorAPI(Hydrax())
    }
}
