plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
    alias(libs.plugins.kotlinx.serialization)
    application
}

group = "com.dream"
version = "1.0.0"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    applicationDefaultJvmArgs =
        listOf("-Dio.ktor.development=${extra["io.ktor.development"] ?: "false"}")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}



dependencies {
    implementation(projects.shared)
    implementation(libs.logback)

    implementation(libs.coil3.compose)
    implementation(libs.coil3.network.ktor)
    implementation(libs.kotlinx.coroutines)
    implementation(libs.kotlinx.serialization)

    implementation(libs.ktor.client.core)
    implementation(libs.ktor.server.call.logging)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.server.content.negotiation)
    implementation(libs.ktor.server.netty)
    implementation(libs.exposed.core)
    implementation(libs.exposed.dao)
    implementation(libs.exposed.jdbc)
    implementation(libs.h2)
    implementation(libs.mysql.connector.java)
    implementation(libs.postgresql)
    implementation(libs.logback.classic)
    implementation(libs.koin.ktor)
    implementation("com.zaxxer:HikariCP:5.0.1")
   // implementation(libs.flyway.core)
    testImplementation("io.ktor:ktor-server-test-host:3.0.0")
   // testImplementation("org.jetbrains.kotlin:kotlin-test:3.0.0")





}