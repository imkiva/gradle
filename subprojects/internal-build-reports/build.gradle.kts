plugins {
    id("gradlebuild.incubation-report-aggregation")
}

description = "The project to aggregate incubation reports from all subprojects"
repositories {
    mavenLocal()
    mavenCentral()
}
dependencies {
    reports(platform(project(":distributions-full")))
}
