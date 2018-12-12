ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "com.example"

lazy val scalaByExample = (project in file("."))
  .settings(
    name := "Scala by example"
  )