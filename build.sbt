name := "scala-selenium-child"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.kumarvikas1.core" % "scala-core_2.11" % "1.0.0-SNAPSHOT"

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-C", "com.kumarvikas1.scala.core.listeners.BaseListeners", "-h", "target/report")