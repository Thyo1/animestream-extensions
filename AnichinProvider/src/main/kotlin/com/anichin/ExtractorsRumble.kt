package com.anichin

import android.util.Log
import com.fasterxml.jackson.annotation.JsonProperty
import com.thyo.animestream.ErrorLoadingException
import com.thyo.animestream.SubtitleFile
import com.thyo.animestream.app
import com.thyo.animestream.utils.AppUtils
import com.thyo.animestream.utils.ExtractorApi
import com.thyo.animestream.utils.ExtractorLink
import com.thyo.animestream.utils.ExtractorLinkType
import com.thyo.animestream.utils.INFER_TYPE
import com.thyo.animestream.utils.getQualityFromName
import com.thyo.animestream.utils.Qualities
import com.thyo.animestream.utils.newExtractorLink
import com.thyo.animestream.utils.*
import org.jsoup.Jsoup

class Rumble : ExtractorApi() {
    override var name = "Rumble"
    override var mainUrl = "https://rumble.com"
    override val requiresReferer = false

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val response = app.get(url, referer = referer ?: "$mainUrl/")
        val scriptData = response.document.selectFirst("script:containsData(mp4)")?.data()
            ?.substringAfter("{\"mp4")?.substringBefore("\"evt\":{")
        if (scriptData == null) return

        val regex = """"url":"(.*?)"|h":(.*?)\}""".toRegex()
        val matches = regex.findAll(scriptData)

        val processedUrls = mutableSetOf<String>()

        for (match in matches) {
            val rawUrl = match.groupValues[1]
            if (rawUrl.isBlank()) continue

            val cleanedUrl = rawUrl.replace("\\/", "/")
            if (!cleanedUrl.contains("rumble.com")) continue
            if (!cleanedUrl.endsWith(".m3u8")) continue
            if (!processedUrls.add(cleanedUrl)) continue

            val m3u8Response = app.get(cleanedUrl)
            val variantCount = "#EXT-X-STREAM-INF".toRegex().findAll(m3u8Response.text).count()

            if (variantCount > 1) {
                callback.invoke(
                    newExtractorLink(
                        this@Rumble.name,   // source
                        "Rumble",       // name
                        cleanedUrl,         // url
                        ExtractorLinkType.M3U8 // type
                        // initializer tidak perlu diisi
                    )
                )
                break
            }
        }
    }
}