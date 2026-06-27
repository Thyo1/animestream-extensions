package com.nontonanimeid

import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class NontonAnimeIDProviderPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(NontonAnimeIDProvider())
        registerExtractorAPI(Nontonanimeid())
        registerExtractorAPI(EmbedKotakAnimeid())
        registerExtractorAPI(KotakAnimeidCom())
        registerExtractorAPI(Gdplayer())
        registerExtractorAPI(Kotaksb())
        registerExtractorAPI(Vidhidepre())
        registerExtractorAPI(Rpmvip())
    }
}