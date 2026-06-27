package com.donghub

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin

@AnimeStreamPlugin
class DonghubProviderPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(DonghubProvider())
        registerExtractorAPI(ArchiveOrgExtractor())
        registerExtractorAPI(Dailymotion())
        registerExtractorAPI(Geodailymotion())
    }
}
