plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":model"))
}

application {
    mainClass.set("com.gradle.lab.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
