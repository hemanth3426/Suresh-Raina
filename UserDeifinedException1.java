package exception;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}

public class UserDeifinedException1 {
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the amount: ");
	     System.out.println("Enter the balance: ");
	     int amount=sc.nextInt();
	     int balance=sc.nextInt();
	     
		try
		{
		if(amount<balance) {
			System.out.println("Thank you");
		}
		else {
//			System.out.println("Thank you");
			throw new MyException(".....Insufficiant balance......");
		}
		}
		catch(Exception ob) 
		{
			System.out.println(ob);
		}
	}
}
//TotalAvaailableTickets-=TotalanumberOF tickets