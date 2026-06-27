package com.otakudesu

import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin
import com.thyo.animestream.extractors.*
import android.content.Context

@AnimeStreamPlugin
class OtakudesuProviderPlugin : BasePlugin() {
    override fun load() {
        registerMainAPI(OtakudesuProvider())
        registerExtractorAPI(PixelDrain())
        registerExtractorAPI(Gofile())
        registerExtractorAPI(Krakenfiles())
        registerExtractorAPI(Ryderjet())
        registerExtractorAPI(VidHideHub())
        registerExtractorAPI(VidHidePro1())
        registerExtractorAPI(VidHidePro2())
        registerExtractorAPI(VidHidePro3())
        registerExtractorAPI(VidHidePro4())
        registerExtractorAPI(VidHidePro5())
        registerExtractorAPI(VidHidePro6())
        registerExtractorAPI(Smoothpre())
        registerExtractorAPI(Dhtpre())
        registerExtractorAPI(Peytonepre())
        registerExtractorAPI(VidHidePro())
        registerExtractorAPI(Acefile())
        registerExtractorAPI(Mp4Upload())
        registerExtractorAPI(Mediafire())
    }
}
