package com.stormunblessed

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.LoadResponse.Companion.addDuration
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.loadExtractor

class PelispediaProvider:MainAPI() {
    override var mainUrl = "https://cinehdplus.org/"
    override var name = "Cinehdplus"
    override var lang = "es"

    override val hasQuickSearch = false
    override val hasMainPage = true
    override val hasChromecastSupport = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(
        TvType.Peliculas,
        TvType.Series,
