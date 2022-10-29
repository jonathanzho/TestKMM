package com.example.jonathan.testkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform