plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    //implementation("com.google.guava:guava:30.0-jre")
    implementation("com.google.guava:guava") {
        version {
            strictly("[28.0-jre, 30.0-jre]")
            prefer("29.0-jre")
        }
    }
    api("org.json:json:20220924")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
