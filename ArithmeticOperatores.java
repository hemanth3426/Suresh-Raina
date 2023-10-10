package Operaters;

class Test1{
	static int a=10;
	static int b=20;
	static int c=b-a;
}
public class ArithmeticOperatores {
	int a=10;
	int b=20;
	int c=a*b;
	public static void main(String[] args) {
		//instance 
		ArithmeticOperatores ob=new ArithmeticOperatores();
		System.out.println("Instance variable:"+ob.c);
		
		//local variable
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Local variable:"+c);
		
		//static
		System.out.println("Static variable:"+Test1.c);
	}
	
}
