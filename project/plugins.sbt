logLevel := Level.Warn
resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("com.novocode" % "sbt-ornate" % "0.2")
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M14")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
