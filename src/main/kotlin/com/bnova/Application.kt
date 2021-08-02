package com.bnova

import com.bnova.plugins.configureSerialization
import com.bnova.plugins.module
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        module()
        configureSerialization()
    }.start(wait = true)
}
