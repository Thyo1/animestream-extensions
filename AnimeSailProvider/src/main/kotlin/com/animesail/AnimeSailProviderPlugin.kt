package com.animesail

import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class AnimeSailProviderPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(AnimeSailProvider())
    }
}