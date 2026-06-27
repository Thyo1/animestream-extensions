package com.moviebox

import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class MovieboxProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(MovieboxProvider())
    }
}
