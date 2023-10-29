package object;
//(short,byte,char)->int,long,float,double
class Case1{
	
	public void show( ) {
		System.out.println("No-arguement method");
	}
	public void show(int a) {
		System.out.println("Int type method");
	}
	public void show(double a) {
		System.out.println("double type method");
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Case1 ob=new Case1();
		ob.show();
		ob.show(10);
		ob.show('a');//first it will search for char if it is not then search for higher(int,long,float,double)
//		ob.show(33495l);//it will search for long or higher(float,double) if it is not compile time error
		ob.show(4545l);
	}
}
