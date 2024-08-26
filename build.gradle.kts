plugins {
	java
}

group = "ru.code"
version = "1.0.0"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter:5.11.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
