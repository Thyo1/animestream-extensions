package com.ngefilm21

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import android.content.Context

@AnimeStreamPlugin
class Ngefilm21ProviderPlugin: BasePlugin() {
    override fun load(context: Context) {
        registerMainAPI(Ngefilm21Provider())
    }
}
