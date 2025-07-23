plugins {
    application
    kotlin("jvm") version "1.9.10"
}

application {
    mainClass.set("MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-netty:2.3.0")
    implementation("ch.qos.logback:logback-classic:1.4.6")
}
application {
    mainClass.set("MainKt")
}
