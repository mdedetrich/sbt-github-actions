organization := "com.github.sbt"
version := "0.0.1"

ThisBuild / crossScalaVersions := Seq("2.13.10", "2.12.17")
ThisBuild / scalaVersion := crossScalaVersions.value.head
ThisBuild / githubWorkflowOSes := Seq("windows-latest")
