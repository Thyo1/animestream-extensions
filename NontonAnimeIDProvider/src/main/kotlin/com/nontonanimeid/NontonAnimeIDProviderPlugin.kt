package com.nontonanimeid

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin
class NontonAnimeIDProviderPlugin: BasePlugin() {
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