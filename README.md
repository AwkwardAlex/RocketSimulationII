## RocketSimulationII

#### Description
This program allows user to build a rocket from pre-defined parts, by chosing one of cabin, engine, fuel tank and
specifying number of engines.

User has a choice to pick one of 5 parts:
- cabin (Archimedes, Avenger, Behemoth, Blitzkrieg, Zenith);
- engine (Raptor, Draco, Merlin, SuperDraco, Kestrel);
- fuel tank (Minimal, Small, Medium, Large, Massive);

#### Start-up instructions:
- clone the project ```git clone https://github.com/AwkwardAlex/RocketSimulationII.git```
- navigate to java directory, by using ```cd RocketSimulationII/src/main/java```
- compile Main file, by using ```javac rocket/Main.java```
- after all steps are completed user can run the program, by using ```java rocket.Main```
##### Alternative start-up algorith
- clone the project ```git clone https://github.com/AwkwardAlex/RocketSimulationII.git```
- navigate to java directory, by using ```cd RocketSimulationII/src/main/java```
- compile Main file, by using ```javac rocket/Main.java```
- create manifest.mf file ```echo "Main-Class: rocket.Main" > manifest.mf
- create .jar file, by using ```jar cmf manifest.mf Main.jar *```
- run Main.jar file, by ```java -jar Main.jar```
