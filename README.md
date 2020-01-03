# JLimelight
A Java library that wraps the Limelight API.

## Table Of Contents
- [JLimelight](#jlimelight)
    - [Table Of Contents](#table-of-contents)
    - [Features](#features)
    - [Basic Usage](#basic-usage)

## Features
A list or other description of features this library has.

<details> <summary> To include SwerveIO in your robot project </summary>
Add this to your `settings.gradle`:

```groovy
sourceControl {
    gitRepository("https://github.com/Team6090/JLimelight") {
        producesModule("net.bancino.robotics:JLimelight")
    }
}
```

Then, add the dependency in `build.gradle`:

```groovy
dependencies {
  api 'net.bancino.robotics:SwerveIO:1.0'
}
```
</details>

If you are using the Gradle Wrapper and your IDE does not download the dependencies automatically, you may need to run the command `./gradlew build` inside the project directory. Otherwise, run `gradle build`. You may need to refresh your IDE or reload the build/classpath configuration.

---