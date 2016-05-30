name := """play-demo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

enablePlugins(DebianPlugin)
maintainer := "TamerB <tamer.bhgt@gmail.com>"
packageSummary := "My First Custom Package"
packageDescription := "first custom package"

