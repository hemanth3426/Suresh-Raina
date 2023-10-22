package polymorphism;
//polymorphism means perform same task in different ways
//compile time->overloading
//run time->overriding
//overloading->1.method,2.operator,3.constructor
class MethodOverloadingDemo1 {
		
	public void add() {
		System.out.println("1st method");
	}
	public void add(int a) {
		System.out.println("2nd method");
	}
	public void add(int a,int b) {
		System.out.println("3rd method:"+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("4th method:"+(a+b));
	}
	public void add(int a,float b) {
		System.out.println("5th method:"+(a+b));
	}
}
	public class MethodOverloadingDemo{
		public static void main(String[] args) {
			MethodOverloadingDemo1 ob=new MethodOverloadingDemo1();
			ob.add();
			ob.add(10);
			ob.add(10,20);
			ob.add(20l, 30);
			ob.add(10, 15l);
		}
	
	 }
