package com.klikxxi

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin

@AnimeStreamPlugin
class KlikxxiProviderPlugin : BasePlugin() {
    override fun load(context: Context) {
        registerMainAPI(KlikxxiProvider())
        registerExtractorAPI(Klixxistrp2p())
        registerExtractorAPI(Klixxiupns())
        registerExtractorAPI(Hglink())  
    }
}
