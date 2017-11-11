name := "KafkaTests"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "1.0.0"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.4" % "test"
libraryDependencies += "net.manub" %% "scalatest-embedded-kafka" % "1.0.0" % "test"


mainClass in Compile := Some("com.brightmeta.KafkaTests.Application")


        