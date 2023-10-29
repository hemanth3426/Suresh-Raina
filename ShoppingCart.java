package collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {
    private String name;
    private double price;
//constructor
    public Product(String name, double price) {
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

	public void setPrice(double price) {
		this.price = price;
	}
	
	//to String
		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + "]";
    }
}
public class ShoppingCart {
	    public static void main(String[] args) {
	        // Create an ArrayList to represent the shopping cart
	        ArrayList<Product> shoppingCart = new ArrayList<>();

	        // Add products to the shopping cart
	        shoppingCart.add(new Product("Laptop", 899.99));
	        shoppingCart.add(new Product("Headphones", 79.99));
	        shoppingCart.add(new Product("Mouse", 19.99));

	        // Print the contents of the shopping cart
	        System.out.println("Shopping Cart Contents:");
	        for (Product product : shoppingCart) {
	            System.out.println(product);
	        }

	        // Calculate the total cost of items in the shopping cart
	        double totalCost = 0;
	        for (Product product : shoppingCart) {
	            totalCost += product.getPrice();
	            
	        }
	        System.out.println("Total Cost: $" + totalCost);
	       
	    }
	}
