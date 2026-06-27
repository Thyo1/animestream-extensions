package com.donghub

import android.content.Context
import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@AnimeStreamPlugin
class DonghubProviderPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(DonghubProvider())
        registerExtractorAPI(ArchiveOrgExtractor())
        registerExtractorAPI(Dailymotion())
        registerExtractorAPI(Geodailymotion())
    }
}
