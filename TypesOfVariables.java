package com.edu;
//local variable
//instance variable
//static variable
class Test1{
	//static variable
	//static variables represent with static.
	static int b=30;
}

public class TypesOfVariables {
	int a=20;//instance variable(we have to create object to access this).
	
	float b=12.5f;
	double d=12.5d;
	char c='a';
	String e="abc";
	
	public static void main(String[] args) {
		//classname objectname=new  TypesOfVariables();
		 TypesOfVariables ob=new  TypesOfVariables();
		 
		//local variable
		int a=10;
		System.out.println(a);
		
		//instance variable
		System.out.println(ob.b);
		System.out.println(ob.d);
		System.out.println(ob.c);
		System.out.println(ob.e);
		
		//static variable
		System.out.println(Test1.b);	
		
	}
}
