import java.util.*;

public class Avatar {

    private String name;
    private int HP = 60; //värde mellan 0-180, kolla exception? kanske inte ens initiera här
    private ArrayList<String> finishedCourses = new ArrayList<String>();// = new List ["Bervet", "PKD", "Automatateori", "Intro-IT", "MDI", "Linjär Algebra I"];
    private ArrayList<String> unfinishedCourses = new ArrayList<String>();// = new List [];
    private int backpackCapacity = 10;
    private ArrayList<String> backpack = new ArrayList<String>();// = new List [];
    private Room currentLocation;

    public Avatar(String avatarName){
	this.name = avatarName;
	this.HP = 60;
	this.finishedCourses.add("Bervet 1");
	this.finishedCourses.add("PKD");
	this.finishedCourses.add("Automata");
	this.finishedCourses.add("MDI");
	this.finishedCourses.add("Intro-IT");
	this.finishedCourses.add("Linalg 1");	
	    }

    public void setHP(int newHP){
	this.HP = newHP;
    }

    public int getHP(){
	return this.HP;
    }
    
    public void showCurrentRoom(){
	this.currentLocation.printName();
	//System.out.println(this.currentLocation.name);
    }

    public ArrayList<String> getFinishedCourses(){
	return this.finishedCourses;
    }
    
    public void setLocation(Room newRoom){
	this.currentLocation = newRoom;
    }

    public Room getLocation(){
	return this.currentLocation;
    }
}
