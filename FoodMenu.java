package collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Items {
    private String name;
    private int price;
//constructor
    public Items(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//to String
		@Override
		public String toString() {
			return "Items [name=" + name + ", price=" + price + "]";
    }
}
public class FoodMenu {
	    public static void main(String[] args) {
	        // Create an ArrayList to represent the Food menu
	        ArrayList<Items> ob = new ArrayList<>();

	        // Add items to the Menu Card
	        ob.add(new Items("Biriyani", 250));
	        ob.add(new Items("Pizza", 140));
	        ob.add(new Items("Burger", 90));

	        // Print the contents of the Menu card contents
	        System.out.println("Menu Card Contents:");
	        for (Items Items : ob) {
	            System.out.println(Items);
	        }

	        // Calculate the total cost of items in the Menu card
	        double totalCost = 0;
	        for (Items Items : ob) {
	            totalCost += Items.getPrice();
	            
	        }
	        System.out.println("Total Cost: $" + totalCost);
	       
	    }
	}