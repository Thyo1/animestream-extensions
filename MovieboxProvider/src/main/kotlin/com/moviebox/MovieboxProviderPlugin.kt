package com.moviebox

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class MovieboxProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(MovieboxProvider())
    }
}
