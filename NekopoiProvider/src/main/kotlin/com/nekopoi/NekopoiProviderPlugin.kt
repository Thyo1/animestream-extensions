package com.nekopoi

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin
class NekopoiProviderPlugin: BasePlugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(NekopoiProvider())
    }
}