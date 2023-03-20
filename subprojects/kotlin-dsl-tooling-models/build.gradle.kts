plugins {
    id("gradlebuild.distribution.api-kotlin")
}

description = "Kotlin DSL Tooling Models for IDEs"
repositories {
    mavenLocal()
    mavenCentral()
}
dependencies {
    api(project(":base-annotations"))
}
