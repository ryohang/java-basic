### Read me first before you do it at office !!!
##### compile class in the command line
    cd src/main/java
	javac io/ascending/training/*.java

##### compile class with package info
go to home directory

    mkdir target
	cd src/main/java
	javac -d ../../../target/ io/ascending/training/*.java

#### Run the main class
go to home directory

	java -cp ./target/ io.ascending.training.Main "hello"
	
#### compile class with maven
    mvn compile
