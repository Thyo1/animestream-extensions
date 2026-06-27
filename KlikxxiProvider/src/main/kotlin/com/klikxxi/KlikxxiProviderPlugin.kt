package com.klikxxi

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin

@AnimeStreamPlugin
class KlikxxiProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(KlikxxiProvider())
        registerExtractorAPI(Klixxistrp2p())
        registerExtractorAPI(Klixxiupns())
        registerExtractorAPI(Hglink())  
    }
}
