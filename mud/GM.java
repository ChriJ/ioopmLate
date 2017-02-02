import java.util.*;
import java.io.*;

    
public class GM {

    public static void main(String[] args) {

	System.out.println("hej");

	//Spawn rooms
	try {
	File roomFile = new File("/home/chrille/ioopmLate/ioopmLate/mud/rooms.txt");
	//File roomFile = new File(".rooms.txt");
	//Path p = new Path(roomFile.toPath());
	//System.out.println(p);
	Scanner roomScanner = new Scanner(roomFile);
	roomScanner.useDelimiter(";");

	int i = 1;
	while(roomScanner.hasNextLine()){
	    String roomNm = roomScanner.next();
	    String northR = roomScanner.next();
	    String eastR = roomScanner.next();
	    String southR = roomScanner.next();
	    String westR = roomScanner.next();
	    String northB = roomScanner.next();
	    String eastB = roomScanner.next();
	    String southB = roomScanner.next();
	    String westB = roomScanner.next();
	    String waste = roomScanner.nextLine();
	    System.out.println(i + roomNm + northR + eastR + southR + westR + northB + eastB + southB + westB);
	    i++;
	}
	
	}
	catch (IOException e) {
	    System.out.println(e);
	}




	Room room1 = new Room("room1");
	Room room2 = new Room("room2");
	Avatar pål = new Avatar("Pål");
	pål.setLocation(room1);
	System.out.println("Nu är vi här:");
	pål.getLocation().printName();
	pål.setLocation(room2);
	System.out.println("Nu är vi här:");
	pål.getLocation().printName();
	System.out.println(pål.getFinishedCourses());
	//Spawn player

	//Ask for action
	
    }
    
}
