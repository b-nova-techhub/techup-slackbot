package com.bnova

import com.bnova.plugins.configureSerialization
import com.bnova.plugins.module
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    val port = System.getenv("PORT").toIntOrNull() ?: 8080
    embeddedServer(Netty, port, host = "0.0.0.0") {
        module()
        configureSerialization()
    }.start(wait = true)
}
