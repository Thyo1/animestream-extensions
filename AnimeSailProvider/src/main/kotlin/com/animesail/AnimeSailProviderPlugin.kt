package com.animesail

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin
class AnimeSailProviderPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(AnimeSailProvider())
    }
}