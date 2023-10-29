package object;

class Case2{
	public void show(Object o) {
		System.out.println("Parent class");
	}
	public void show(String s) {
		System.out.println("Child class");
	}
}

public class ObjectDemo1 {
	public static void main(String[] args) {
		Case2 ob=new Case2();
		ob.show(new Object());
		ob.show("Hemanth");
		ob.show("Hello");
		ob.show(null);//first priority goes to child class
	}
}
