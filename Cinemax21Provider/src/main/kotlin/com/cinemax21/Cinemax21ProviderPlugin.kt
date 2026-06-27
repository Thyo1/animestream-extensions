package com.cinemax21

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin
class Cinemax21ProviderPlugin : BasePlugin() {
    override fun load(context: Context) {
        registerMainAPI(Cinemax21Provider())
        registerExtractorAPI(Jeniusplay())
    }
}
