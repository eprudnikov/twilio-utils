plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "com.github.eprudnikov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.6")
    implementation("com.twilio.sdk:twilio:10.1.1")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

application {
    mainClass.set("org.example.com.github.eprudnikov.twilio.utils.MainKt")
}

tasks.register<JavaExec>("list-calls") {
    group = "application"
    mainClass.set("org.example.com.github.eprudnikov.twilio.utils.MainKt")
    classpath = sourceSets.main.get().runtimeClasspath
    args = listOf("list-calls")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}