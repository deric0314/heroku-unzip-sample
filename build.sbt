name := """heroku-unzip-sample"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.apache.ant" % "ant" % "1.9.7",
  "net.kaliber" %% "play-s3" % "8.0.0"
)
