package Operaters;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter First Number");
//		int a=sc.nextInt();
//		System.out.println("Enter Second Number");
//		int b=sc.nextInt();
//		System.out.println("Enter Third Number");
//		int c=sc.nextInt();
//		int d=a+b+c;
//		System.out.println("Addition of two numbers:"+d);
		
		System.out.println("Enter ur name");
//		String name=sc.next();//it can print only one word
		String name=sc.nextLine();// it can print whole line
		System.out.println(name);
	}
}
