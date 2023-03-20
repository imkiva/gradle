plugins {
    id("gradlebuild.distribution.implementation-java")
    id("gradlebuild.publish-public-libraries")
}

description = "Tools to work with functional code, including data structures"
repositories {
    mavenLocal()
    mavenCentral()
}
dependencies {
    implementation(project(":base-annotations"))
}
