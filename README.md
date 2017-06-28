# kotlin-1.1.3-noarg-bug

Reproducible test case for [KT-18667](https://youtrack.jetbrains.com/issue/KT-18667), derived from
the test case for [KT-18649](https://youtrack.jetbrains.com/issue/KT-18649) ([Github](https://github.com/komu/kotlin-1.1.3-noarg-bug))

## Running

Try to compile the code with:

```shell
./gradlew clean build
```

This fails with error:

```
Error:Kotlin: [Internal Error] java.lang.ClassCastException: org.jetbrains.kotlin.descriptors.SourceElement$1 cannot be cast to org.jetbrains.kotlin.resolve.source.PsiSourceElement
	at org.jetbrains.kotlin.codegen.inline.InlineCodegenUtilsKt.getSourceFilePath(inlineCodegenUtils.kt:35)
	at org.jetbrains.kotlin.codegen.inline.InlineCodegen.reportIncrementalInfo(InlineCodegen.java:1040)
	at org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>(InlineCodegen.java:143)
	at org.jetbrains.kotlin.codegen.ExpressionCodegen.getOrCreateCallGenerator(ExpressionCodegen.java:2299)
```
(rest of exception stacktrace removed)

## Changes

Modify `build.gradle` to either:

- change `kotlinVersion` to `1.1.2-2`
- comment out `kotlin-jpa`

Both changes will cause the build to succeed.
