package com.donghub

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin
class DonghubProviderPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(DonghubProvider())
        registerExtractorAPI(ArchiveOrgExtractor())
        registerExtractorAPI(Dailymotion())
        registerExtractorAPI(Geodailymotion())
    }
}
