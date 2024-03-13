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
    implementation("com.twilio.sdk:twilio:10.1.1")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

application {
    mainClass.set("org.example.com.github.eprudnikov.twilio.utils.ListCallsKt")
}

tasks.register<JavaExec>("list-calls") {
    group = "application"
    mainClass.set("org.example.com.github.eprudnikov.twilio.utils.ListCallsKt")
    classpath = sourceSets.main.get().runtimeClasspath
    args = listOf("--today")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}