package com.indomax21

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin
class IndoMax21ProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(IndoMax21Provider())
    }
}
