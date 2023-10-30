package map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapDemo2 {
	 public static void main(String[] args) {
		 while(true){
			 Scanner sc=new Scanner(System.in);
			 HashMap<String,Integer>ob=new HashMap();
			 
			 ob.put("ACSCE", 50);
			 ob.put("BIT", 30);
			 ob.put("PESET", 60);
			 ob.put("BMS", 70);
			 
			 System.out.println("Enter The College Name");
			 String collegename=sc.nextLine();
			 System.out.println("Enter the number of seats");
			 int seats=sc.nextInt();
			 
			 if(ob.containsKey(collegename)) {
				 int availableseats=ob.get(collegename);
				 
				 if(availableseats>=seats) {
					 ob.put(collegename, availableseats-seats);
					 System.out.println("You will get Seat! Remaining seats in "+collegename+"is:"+(availableseats-seats));
				 } 
					 else {
						 System.out.println("Sorry seats are not available "+collegename+ "s in stock");
					 }
			 }
				    else {
					 System.out.println("college name is not found");
						 
					 }
				 }
			 }
	 }

