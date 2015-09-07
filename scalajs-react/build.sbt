import SonatypeKeys._

sonatypeSettings

seq(bintrayPublishSettings: _*)

pomExtra := {
  <scm>
    <connection>scm:git:github.com/kanterov/scala-js-react.git</connection>
    <developerConnection>scm:git:git@github.com:scala-js-react.git</developerConnection>
    <url>https://github.com/kanterov/scala-js-react</url>
    <tag>{"release-0.4.0"}</tag>
  </scm>
  <developers>
    <developer>
      <id>kanterov</id>
      <name>Gleb Kanterov</name>
      <email>gleb@kanterov.ru</email>
    </developer>
  </developers>
}

