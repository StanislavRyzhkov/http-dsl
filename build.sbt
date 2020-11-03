
name := "http-dsl"

version := "0.1"

scalaVersion := "2.12.12"

lazy val common = (project in file("."))
  .enablePlugins(ScalafmtPlugin)
  .enablePlugins(AssemblyPlugin)
  .settings(
    name := "http-dsl",
    libraryDependencies ++= Seq(
      "org.scalatest"         %% "scalatest"            % "3.2.0" % Test,
      "org.scalatest"         %% "scalatest-core"       % "3.2.0",
      "org.scalatest"         %% "scalatest-funsuite"   % "3.2.0" % Test
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:postfixOps"
    ),
    mainClass in (Compile, run) := Some("company.ryzhkov.Application"),
    mainClass in (assembly) := Some("company.ryzhkov.Application"),
    assemblyJarName in assembly := "http.jar"
  )
