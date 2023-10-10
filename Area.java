package Operaters;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter lenght");
		int l=sc.nextInt();
		
		System.out.println("enter breadth");
		int b=sc.nextInt();
		
		double area=l*b;
		
		System.out.println(area);
	}
}
