package com.hidoristream

import android.content.Context
import com.thyo.animestream.plugins.AnimeStreamPlugin
import com.thyo.animestream.plugins.BasePlugin


@AnimeStreamPlugin
class HidoristreamProviderPlugin : BasePlugin() {
    override fun load(context: Context) {
        registerMainAPI(HidoristreamProvider())
        registerExtractorAPI(Dingtezuni())
        registerExtractorAPI(Bingezove())
        registerExtractorAPI(Mivalyo())
        registerExtractorAPI(Hglink())
        registerExtractorAPI(Ryderjet())
        registerExtractorAPI(Ghbrisk())
        registerExtractorAPI(Dhcplay())
        registerExtractorAPI(Movearnpre())
        registerExtractorAPI(Streamcasthub())
        registerExtractorAPI(Dm21upns())
        registerExtractorAPI(Dm21())
        registerExtractorAPI(Dintezuvio())
        registerExtractorAPI(Dm21embed())
        registerExtractorAPI(Veev())
        registerExtractorAPI(Minochinos())
        registerExtractorAPI(Serhmeplayer())
        registerExtractorAPI(HidoriStream())
        registerExtractorAPI(Terabox())
        registerExtractorAPI(Buzzheavier())
    }
}
