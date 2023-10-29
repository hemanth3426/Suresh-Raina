package exception;

import java.util.Scanner;
	
class MyException extends Exception{
		public MyException(String message) {
			super(message);
		}
	}

	public class UserDefinedException2 {
		public static void main(String[] args) {
			
			 Scanner sc=new Scanner(System.in);
		     System.out.println("Enter the TotalTickets: ");
		     int TotalTickets=sc.nextInt();
		     System.out.println("Enter the RequiredTickets: ");
		     
		     int RequiredTickets=sc.nextInt();
		     
			try
			{
			if(RequiredTickets<TotalTickets) {
				int AvailableTickets=TotalTickets-=RequiredTickets;
				System.out.println("Remaining Tickets Are: "+AvailableTickets);
				
			}
			else {
				throw new MyException("Tickets Not Available");
			}
			}
			catch(Exception ob) 
			{
//				ob.printStackTrace();
				System.out.println(ob);
			}
		}
	}

