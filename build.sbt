name := "minimal-scala"
sbt.version=0.13.8

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// We're using Apache Spark extensively in this class, including it in base template
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.1"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

