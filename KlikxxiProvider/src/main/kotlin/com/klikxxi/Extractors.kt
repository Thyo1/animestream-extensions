package com.klikxxi

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
import com.thyo.animestream.extractors.VidStack
import java.net.URI



class Klixxistrp2p : VidStack() {
    override var name = "Klixxistrp2p"
    override var mainUrl = "https://klikxxi.strp2p.site"
    override var requiresReferer = true
}

class Hglink : StreamWishExtractor() {
    override val name = "Hglink"
    override val mainUrl = "https://hglink.to"
}

class Klixxiupns : VidStack() {
    override var name = "Klixxiupns"
    override var mainUrl = "https://klikxxi.upns.one"
    override var requiresReferer = true
}

