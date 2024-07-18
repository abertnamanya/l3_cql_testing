/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.9/userguide/building_java_projects.html in the Gradle documentation.
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // This dependency is used by the application.
    implementation(libs.clinicalReasoning)
    implementation(libs.clinicalReasoningCql)
    implementation(libs.clinicalReasoningUtility)
    implementation(libs.clinicalReasoningTest)
    implementation ("javax.xml.bind:jaxb-api:2.3.1")
    implementation ("com.sun.xml.bind:jaxb-core:2.3.0.1")
    implementation ("com.sun.xml.bind:jaxb-impl:2.3.3")
    implementation ("javax.activation:activation:1.1.1")
    implementation(platform(libs.junitBom))
    implementation(libs.junitJupiter)
    implementation(libs.junitPlatform)
    implementation(libs.skyscreamer)
//    implementation ("info.cqframework:model-jackson:2.4.0")
//    implementation("org.opencds.cqf.cql:evaluator.plandefinition:3.0.0-PRE4")
//    implementation("org.opencds.cqf.cql:evaluator.jackson-deps:3.0.0-PRE4")
//    implementation ("org.opencds.cqf.cql:evaluator.measure-hapi:3.0.0-PRE5")
//    implementation ("ca.uhn.hapi.fhir:hapi-fhir-caching-api:6.4.4")
//    implementation ("ca.uhn.hapi.fhir:hapi-fhir-caching-caffeine:6.4.4")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(11)
    }
}

application {
    // Define the main class for the application.
    mainClass = "org.uwdigi.who.l3.cqltesting.Main"
}
