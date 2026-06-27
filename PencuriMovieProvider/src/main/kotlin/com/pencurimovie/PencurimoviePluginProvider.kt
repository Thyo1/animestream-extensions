package com.pencurimovie

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class PencurimoviePluginProvider: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(PencurimovieProvider())
        registerExtractorAPI(Dsvplay())
        registerExtractorAPI(Hglink())
    }
}
