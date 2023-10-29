package object;

class Case3{
	public void show(String s) {
		System.out.println("child class");
	}
	public void show(StringBuffer sb) {
		System.out.println("Child class");
	}
}

public class ObjectDemo2 {
	public static void main(String[] args) {
		Case3 ob=new Case3();
		ob.show("Hemanth");
		ob.show(new StringBuffer());
//		ob.show(null);//compile time error bcoz both are child class
	}

}
