package com.ngefilm21

import com.lagradost.cloudstream3.plugins.AnimeStreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@AnimeStreamPlugin
class Ngefilm21ProviderPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Ngefilm21Provider())
    }
}
