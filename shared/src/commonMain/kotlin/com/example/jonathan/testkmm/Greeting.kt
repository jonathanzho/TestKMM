package com.example.jonathan.testkmm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        //return "Hello, ${platform.name}!"
        return "Hello, KMM Android!"
    }
}