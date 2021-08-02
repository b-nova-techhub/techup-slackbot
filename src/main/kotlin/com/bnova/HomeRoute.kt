package com.bnova

import com.slack.api.Slack
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Routing.homeRoute() {
    get("/") {
        val token = System.getenv("SLACK_TOKEN")
        val slack = Slack.getInstance()
        val response = slack.methods(token).chatPostMessage {
            it.channel("#sandbox")
                .text("Hello b-nova! :wave:")
        }

        call.respondText("Response is: $response")
    }
}
