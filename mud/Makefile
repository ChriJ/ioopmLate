all:
	javac -Xlint:unchecked -g GM.java Room.java
clean:
	rm -f *~
	rm -f *#
	rm -f *.gch
	rm -f *.class

test:
	javac -cp .:junit-4.12.jar 
	java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CustomerTest
