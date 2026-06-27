package com.anoboy

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin


@AnimeStreamPlugin
class AnoboyPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Anoboy())
        registerExtractorAPI(BloggerExtractor())
    }
}
