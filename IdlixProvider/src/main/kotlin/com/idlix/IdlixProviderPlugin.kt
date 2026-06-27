package com.idlix

import com.thyo.animestream.plugins.BasePlugin
import com.thyo.animestream.plugins.AnimeStreamPlugin

@AnimeStreamPlugin
class IdlixProviderPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(IdlixProvider())
        registerExtractorAPI(Jeniusplay())
    }
}
