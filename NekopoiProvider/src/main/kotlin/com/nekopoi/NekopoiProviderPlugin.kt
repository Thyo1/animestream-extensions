package com.nekopoi

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin  
class NekopoiProviderPlugin: BasePlugin() {
    override fun load() {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(NekopoiProvider())
    }
}