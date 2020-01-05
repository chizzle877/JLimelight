# JLimelight
A Java library that wraps the Limelight API. This library was intended to be an easy replacement to the NetworkTables API.

## Table Of Contents
- [JLimelight](#jlimelight)
    - [Table Of Contents](#table-of-contents)
    - [Features](#features)
    - [Basic Usage](#basic-usage)

## Features
- **Simple Implementation**: JLimelight doesn't re-invent the wheel; it uses the [Limelight NetworkTables API](http://docs.limelightvision.io/en/latest/networktables_api.html) that teams would normally use.
- **Simple To Use**: Unlike the NetworkTables API, JLimelight was designed to be easy to use without having to reference the documentation. That is, all NetworkTables keys are wrapped in easy-to-read functions.
- **Pure, Native Java**: Instead of pulling keys from a hash table to interface with your Limelight, you can construct a Java `Limelight` object that you can easily push and pull data from and to. Written in Java by Java developers, JLimelight takes advantage of the Java language and follows all the conventions of Java libraries. This makes for seamless integration with your Java robotics projects.
- **Complete**: The *entire* working Limelight API is implemented in this library.

## Basic Usage

<details> <summary> To include JLimelight in your robot project </summary>

Add the Maven repository in `build.gradle`:

```groovy
repositories {
  maven {
    url 'https://dump.bancino.net/maven'
  }
}
```

Then add the dependency:

```groovy
dependencies {
  api 'net.bancino.robotics:Java-API-Template:x.y.z'
}
```
</details>

If you are using the Gradle Wrapper and your IDE does not download the dependencies automatically, you may need to run the command `./gradlew build` inside the project directory. Otherwise, run `gradle build`. You may need to refresh your IDE or reload the build/classpath configuration.

---

Usage of this library is simple, all you have to do is create a `Limelight` object whereever you create your subsystems. We typically do it right in our `Robot.java`, or we create a static `Subsystems` class.

```java
import net.bancino.robotics.jlimelight.Limelight;
/* ... */

Limelight limelight = new Limelight();
```

Then you can access limelight methods such as:

```java
if (limelight.hasValidTargets()) {
    double area = limelight.getTargetArea();
}
```

See, it's easy! If you're looking for advanced features like raw contours and crosshairs, you can create an advanced limelight object:

```java
Limelight limelight = AdvancedLimelight("limelight");
```

Make sure you check out the JavaDoc for complete usage. You can build the JavaDoc by running `gradle javadoc` (or `./gradlew javadoc` if you use Gradle Wrapper) and then reference `build/docs/javadoc/index.html`.
