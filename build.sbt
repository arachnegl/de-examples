ThisBuild / scalaVersion := "2.13.10"
ThisBuild / version := "0.1"
ThisBuild / organization := "com.sgl"

lazy val hello = (project in file("."))
  .settings(
    name := "cdc_kafka_scala_demo",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7",
    libraryDependencies += "io.debezium" % "debezium-connector-mysql" % "2.1.3.Final",
    libraryDependencies += "org.apache.kafka" %% "kafka-streams-scala" % "3.4.0"
    % Test,
  )
