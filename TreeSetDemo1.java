package collectionlist;
import java.util.TreeSet;
import java.util.Scanner;

class Players implements Comparable<Players> {
    private String Name;
    private String JercyNumber;

    public Players(String Name, String JercyNumber) {
        this.Name = Name;
        this.JercyNumber = JercyNumber;
    }

    public String getName() {
        return Name;
    }

    @Override
    public int compareTo(Players other) {
        return this.JercyNumber.compareTo(other.JercyNumber);
    }

    @Override
    public String toString() {
        return Name + " - " + JercyNumber;
    }
}
public class TreeSetDemo1 {
	
	    public static void main(String[] args) {
	        // Create a TreeSet to store contacts (sorted by name)
	        TreeSet<Players> PlayersList = new TreeSet<>();

	        // Add Players to the list
	        //contactList.add("Dhoni","7");
	        PlayersList.add(new Players("Kohli", "18"));
	        PlayersList.add(new Players("Rohit", "45"));
	        PlayersList.add(new Players("Rahul", "1"));
	        PlayersList.add(new Players("Chahal", "3"));
	        
	        // Attempt to add a duplicate contact
	        boolean isAdded = PlayersList.add(new Players("Raina", "3"));

	        if (isAdded) {
	            System.out.println("JercyNo 3 added successfully.");
	        } else {
	            System.out.println("JercyNo 3  is already in the list.");
	        }

	        // Print the sorted list of contacts
	        System.out.println("PlayersList (Sorted by Name):");
	        for (Players players : PlayersList) {
	            System.out.println(players);
	        }
	    }
}
