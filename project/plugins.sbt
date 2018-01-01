addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.21")
addSbtPlugin("org.portable-scala" % "sbt-crossproject" % "0.3.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.3.0")
addSbtPlugin(
  "org.scala-native" % "sbt-scala-native" % "0.3.6"
    // see https://github.com/portable-scala/sbt-crossproject/issues/72
    exclude("org.scala-native", "sbt-crossproject")
)

addSbtCoursier
