import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-spring-data-jpa"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    javaCore,
    javaJpa,

    "org.springframework" % "spring-context" % "3.2.2.RELEASE",
    "javax.inject" % "javax.inject" % "1",

    "org.springframework.data" % "spring-data-jpa" % "1.3.2.RELEASE",
    "org.hibernate" % "hibernate-entitymanager" % "3.6.10.Final"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    ebeanEnabled := false
  )

}
