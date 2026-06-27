package com.javhey

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.Plugin // <--- PENTING: Ini class induknya
import android.content.Context

@AnimeStreamPlugin
class JavHeyProviderPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(JavHeyProvider())
    }
}
