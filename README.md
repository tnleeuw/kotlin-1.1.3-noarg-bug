# kotlin-1.1.3-noarg-bug

Reproducible test case for for [KT-18649](https://youtrack.jetbrains.com/issue/KT-18649).

## Running

Try to compile the code with:

```shell
./gradlew clean build
```

This fails with error:

```
Error:Kotlin: [Internal Error] org.jetbrains.kotlin.codegen.CompilationException: Back-end (JVM) Internal error: Don't know how to generate outer expression for class Foo
Cause: Don't know how to generate outer expression for class Foo
```

## Changes

Modify `build.gradle` to either:

- change `kotlinVersio` to `1.1.2-2`
- comment out `kotlin-jpa`

Both changes will cause the build to succeed.
