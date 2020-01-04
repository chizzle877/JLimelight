# Java-API-Template
Library description goes here.

## Table Of Contents
- [Java-API-Template](#java-api-template)
    - [Table Of Contents](#table-of-contents)
    - [Features](#features)
    - [Basic Usage](#basic-usage)

## Features
A list or other description of features this library has.

## Basic Usage

<details> <summary> To include SwerveIO in your robot project </summary>
Add this to your `settings.gradle`:

```groovy
sourceControl {
    gitRepository("https://github.com/Team6090/Java-API-Template") {
        producesModule("net.bancino.robotics:Java-API-Template")
    }
}
```

Then, add the dependency in `build.gradle`:

```groovy
dependencies {
  api 'net.bancino.robotics:Java-API-Template:1.0.0'
}
```
</details>

If you are using the Gradle Wrapper and your IDE does not download the dependencies automatically, you may need to run the command `./gradlew build` inside the project directory. Otherwise, run `gradle build`. You may need to refresh your IDE or reload the build/classpath configuration.

---


Explain, with an example, how to get started with this library
