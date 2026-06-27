package com.pencurimovie

import com.thyo.animestream.app
import com.thyo.animestream.utils.ExtractorApi
import com.thyo.animestream.utils.ExtractorLink
import com.thyo.animestream.utils.*
import com.thyo.animestream.USER_AGENT
import com.thyo.animestream.SubtitleFile
import com.thyo.animestream.utils.M3u8Helper.Companion.generateM3u8
import com.thyo.animestream.utils.ExtractorLinkType
import com.thyo.animestream.utils.Qualities
import com.thyo.animestream.utils.AppUtils.tryParseJson
import com.thyo.animestream.base64Decode
import com.thyo.animestream.extractors.StreamWishExtractor
import com.thyo.animestream.extractors.DoodLaExtractor
import com.fasterxml.jackson.annotation.JsonProperty
import java.net.URI


class Hglink : StreamWishExtractor() {
    override val name = "Hglink"
    override val mainUrl = "https://hglink.to"
}

class Dsvplay : DoodLaExtractor() {
    override var mainUrl = "https://dsvplay.com"
}
