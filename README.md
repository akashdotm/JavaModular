# JavaModular
Multiple modules based on Java 9, aiming to resolve cyclic dependency.
To run the modules =>

1. cd to ThirdConcern root directory
2. mvn clean install
3. cd to AllTimeRefConcern root directory
4. mvn clean install
5. cd to SecondConcern root directory
6. mvn clean install
7. mvn exec:java -Dexec.mainClass="com.jvb.self.modtwo.BlackBookMain"
