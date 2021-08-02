val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val slack_version = "1.9.0"

plugins {
    application
    kotlin("jvm") version "1.5.21"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "com.bnova"
version = "1.0.0"
application {
    mainClass.set("com.bnova.ApplicationKt")
}


repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-gson:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlin_version")
    implementation("com.slack.api:slack-api-client:$slack_version")
    implementation("com.slack.api:slack-api-model-kotlin-extension:$slack_version")
    implementation("com.slack.api:slack-api-client-kotlin-extension:$slack_version")
}

tasks.register("stage") {
    dependsOn("shadowJar")
}

tasks {
    shadowJar {
        manifest.attributes["Main-Class"] = "com.bnova.ApplicationKt"
        archiveClassifier.set("")
    }
}