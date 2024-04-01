/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;
  
  }
//returns whether or not the house has a dining room
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }
//returns the number of residents in the house 
  public int nResidents() {
    return residents.size();
  }
//move in method
  public void moveIn(String name) {
    residents.add(name);
  }
//move out method
  public String moveOut(String name) {
    if (residents.contains(name)) {
        residents.remove(name);
        return name;
    }
    
    return null; // Person not found in residents list
  }
//returns whether or not a person (given name) is a resident
  public boolean isResident(String person) {
    return residents.contains(person);
}

// Overriding toString() method to provide more information
@Override
public String toString() {
    return super.toString() + "\nDining Room: " + (hasDiningRoom ? "Yes" : "No") + "\nResidents: " + residents;
}

public static void main(String[] args) {
  House myHouse = new House("Cozy Cottage", "123 Main St", 2, true);
  System.out.println(myHouse);
  myHouse.moveIn("Alice");
  myHouse.moveIn("Bob");
  System.out.println("Number of residents: " + myHouse.nResidents());
  System.out.println("Is Alice a resident? " + myHouse.isResident("Alice"));
  System.out.println("Is Carol a resident? " + myHouse.isResident("Carol"));
  System.out.println("Residents: " + myHouse.residents);
  myHouse.moveOut("Alice");
  System.out.println("Number of residents after move out: " + myHouse.nResidents());
  System.out.println("Residents after move out: " + myHouse.residents);
  System.out.println("You have built a house: 🏠");
}
}

