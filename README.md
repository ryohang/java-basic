### Read me first before you do it at home !!!
##### compile class in the command line
    cd src
	javac io/ascending/training/*.java

##### compile class with package info
    mkdir target
	cd src
	javac -d ../target/ io/ascending/training/*.java

#### Run the main class
	java -cp ./target/ io.ascending.training.Main "hello"
