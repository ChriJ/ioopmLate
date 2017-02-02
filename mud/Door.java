public class Door {

    private Room first;
    private Room second;
    private Boolean locked = False;

    public Door(Room one, Room two){
	this.first = one;
	this.second = two;
    }

}
