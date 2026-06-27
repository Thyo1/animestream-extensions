package com.animesail

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class AnimeSailProviderPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(AnimeSailProvider())
    }
}