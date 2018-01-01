
import sbtcrossproject.CrossPlugin.autoImport.crossProject

lazy val root = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .in(file("."))
  .settings(
    scalaVersion := "2.11.12",
    libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test",
    testFrameworks += new TestFramework("utest.runner.Framework")
  )

lazy val rootJVM = root.jvm
lazy val rootJS = root.js
lazy val rootNative = root.native
