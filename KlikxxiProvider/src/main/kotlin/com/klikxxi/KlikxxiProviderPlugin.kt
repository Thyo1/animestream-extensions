package com.klikxxi

import android.content.Context
import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@AnimeStreamPlugin
class KlikxxiProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(KlikxxiProvider())
        registerExtractorAPI(Klixxistrp2p())
        registerExtractorAPI(Klixxiupns())
        registerExtractorAPI(Hglink())  
    }
}
