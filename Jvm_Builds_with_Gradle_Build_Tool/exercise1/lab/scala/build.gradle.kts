/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Scala application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.5.1/userguide/building_java_projects.html
 */

plugins {
    // Apply the scala Plugin to add support for Scala.
    scala

    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("shared-build-conventions")
}

dependencies {
    // Use Scala 2.13 in our library project
    implementation("org.scala-lang:scala-library:2.13.7")

    // Use Scalatest for testing our library
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.scalatest:scalatest_2.13:3.2.10")
    testImplementation("org.scalatestplus:junit-4-13_2.13:3.2.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")

    // Need scala-xml at test runtime
    testRuntimeOnly("org.scala-lang.modules:scala-xml_2.13:1.2.0")
}

application {
    // Define the main class for the application.
    mainClass.set("com.gradle.lab.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}