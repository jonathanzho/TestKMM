package com.example.jonathan.testkmm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, This is a demo for KMM on ${platform.name}!"
    }
}