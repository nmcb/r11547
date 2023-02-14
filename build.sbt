scalaVersion := "3.2.1"
//scalaVersion := "3.0.0-RC2"

scalacOptions ++= Seq(
  "-encoding", "utf8",
  "-feature",
  "-language:implicitConversions",
  "-language:existentials",
  "-unchecked",
  "-Werror",
  "-explain"
)
