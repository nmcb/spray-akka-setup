name := "artmc"

version := "0.0.1"

scalaVersion := "2.10.5"

resolvers += "spray repo" at "http://repo.spray.io"

// resolvers += "spray nightlies" at "http://nightlies.spray.io"

libraryDependencies ++= Seq(
  "com.typesafe.akka"  %% "akka-actor"       % "2.3.11",
  "com.typesafe.akka"  %% "akka-slf4j"       % "2.3.11",
  "ch.qos.logback"      % "logback-classic"  % "1.0.13",
  "io.spray"           %% "spray-can"        % "1.3.2",
  "io.spray"           %% "spray-routing"    % "1.3.2",
  "io.spray"           %% "spray-json"       % "1.3.2",
  "org.specs2"         %% "specs2"           % "1.14"         % "test",
  "io.spray"           %% "spray-testkit"    % "1.3.2"        % "test",
  "com.typesafe.akka"  %% "akka-testkit"     % "2.2.0"        % "test",
  "com.novocode"        % "junit-interface"  % "0.7"          % "test->default"
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-Ywarn-dead-code",
  "-language:_",
  "-target:jvm-1.6",
  "-encoding", "UTF-8"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
