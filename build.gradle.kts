plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
// https://mvnrepository.com/artifact/org.jboss.resteasy/resteasy-client
    implementation("org.jboss.resteasy:resteasy-client:6.2.4.Final")
// https://mvnrepository.com/artifact/org.jboss.resteasy/resteasy-jackson2-provider
    implementation("org.jboss.resteasy:resteasy-jackson2-provider:6.2.4.Final")

}

tasks.test {
    useJUnitPlatform()
}