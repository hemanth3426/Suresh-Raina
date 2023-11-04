package lamdaexpression;
import java.util.Scanner;

interface Demo2{
public int operators(int a,int b);
}

public class LamdaDemo2 {
	public static void main(String[] args) {
		
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		System.out.println("Enter the value of b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//		Demo2 ob=(aVal,bVal)->{return aVal+bVal;};
//		ob.operators(a, b);
//		System.out.println("Addition of two numbers:"+ob.operators(a, b));
//		System.out.println();
		
		Demo2 ob=(aVal,bVal)->{return aVal-bVal;};
		ob.operators(a, b);
		System.out.println("Substraction of two numbers:"+ob.operators(a, b));
		System.out.println();
		
//		Demo2 ob=(aVal,bVal)->{return aVal*bVal;};
//		ob.operators(a, b);
//		System.out.println("Multiplication of two numbers:"+ob.operators(a, b));
//		System.out.println();
		
//		Demo2 ob=(aVal,bVal)->{return aVal/bVal;};
//		ob.operators(a, b);
//		System.out.println("Division of two numbers:"+ob.operators(a, b));
//		System.out.println();
	}
  }
}




