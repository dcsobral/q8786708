import sbt._
import Keys._

object HelloBuild extends Build {
  lazy val root = Project(id = "hello",
                        base = file(".")) settings (publish := { }, publishLocal := { }) aggregate(foo, bar) 

  lazy val foo = Project(id = "hello-foo",
                       base = file("foo"))

  lazy val bar = Project(id = "hello-bar",
                       base = file("bar"))
}

