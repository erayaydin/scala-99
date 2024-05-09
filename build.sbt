lazy val root = (project in file("."))
  .settings(
    name := "Scala-99",
    idePackagePrefix := Some("in.yayd.era.s99"),
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.4.1",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
