package com.chandra.capshar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform