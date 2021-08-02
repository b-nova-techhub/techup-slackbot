package com.bnova.plugins

import com.bnova.homeRoute
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}

fun Application.module(testing: Boolean = false) {
    routing {
        homeRoute()
    }
}