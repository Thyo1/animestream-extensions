package com.ngefilm21

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin @com.lagradost.cloudstream3.plugins.CloudstreamPlugin 
class Ngefilm21ProviderPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(Ngefilm21Provider())
    }
}
