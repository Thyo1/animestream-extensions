package com.anoboy

import android.content.Context
import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin


@AnimeStreamPlugin
class AnoboyPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Anoboy())
        registerExtractorAPI(BloggerExtractor())
    }
}
