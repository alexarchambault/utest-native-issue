To reproduce
```
$ sbt rootNative/test
[info] Loading settings from plugins.sbt ...
[info] Loading project definition from /Users/alexandre/projects/test/utest-cross/project/project
[info] Updating {file:/Users/alexandre/projects/test/utest-cross/project/project/}utest-cross-build-build...
[info] Done updating.
[info] Loading settings from plugins.sbt ...
[info] Loading project definition from /Users/alexandre/projects/test/utest-cross/project
[info] Loading settings from build.sbt ...
[info] Set current project to utest-cross (in build file:/Users/alexandre/projects/test/utest-cross/)
[info] Compiling 1 Scala source to /Users/alexandre/projects/test/utest-cross/native/target/scala-2.11/test-classes ...
[info] Done compiling.
[info] Compiling 1 Scala source to /Users/alexandre/projects/test/utest-cross/native/target/scala-2.11/test-classes ...
[info] Done compiling.
[info] Linking (2655 ms)
[error] cannot link: @java.lang.Class::getField_java.lang.String_java.lang.reflect.Field
[error] cannot link: @java.lang.ClassLoader::loadClass_java.lang.String_java.lang.Class
[error] unable to link
[error] (rootNative/nativetest:nativeLinkNIR) unable to link
[error] Total time: 14 s, completed …
```
