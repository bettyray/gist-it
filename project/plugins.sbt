resolvers ++= Seq(
  Resolver.file(System.getProperty("user.home") + "/.ivy2/local"),
  Resolver.url("scalasbt snapshots", new
        URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-snapshots"))(Resolver.ivyStylePatterns)
)

addSbtPlugin("org.scala-sbt" % "sbt-android-plugin" % "0.6.1-SNAPSHOT")
