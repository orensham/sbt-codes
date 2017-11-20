name := "oren-project"

version := "1.0"

val gitHeadCommitSha = taskKey[String]("Determines the current git commit SHA")

gitHeadCommitSha := Process("git rev-parse HEAD").lines.head

libraryDependencies += "org.specs2" % "specs2_2.10" % "1.14" % "test"
