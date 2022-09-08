ThisBuild / scalaVersion := "2.13.8"
ThisBuild / scalafmtOnCompile := true

lazy val longlines = project in file("longlines")
lazy val firstclass = project in file("firstclass")
lazy val partiallyapplied = project in file("partiallyapplied")
lazy val partial = project in file("partial")
lazy val curried = project in file("curried")
lazy val implicitfunction = project in file("implicitfunction")