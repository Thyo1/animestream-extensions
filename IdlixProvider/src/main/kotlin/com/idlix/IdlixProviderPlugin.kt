package com.idlix

import com.thyo.animestream.plugins.BasePlugin
import com.thyo.animestream.plugins.AnimeStreamPlugin

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin
class IdlixProviderPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(IdlixProvider())
        registerExtractorAPI(Jeniusplay())
    }
}
