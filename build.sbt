// build.sbt --- Scala build tool settings

scalaVersion := "2.11.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8", "-Ywarn-adapted-args", "-Ywarn-dead-code", "-Ywarn-numeric-widen", "-Ywarn-inaccessible")

libraryDependencies ++= List(
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2" % "test"
)

testOptions in Test += Tests.Argument("-oD")

scalariformSettings
