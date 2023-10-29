package object;

class Case4{
	public void show(int a) {
		System.out.println("One arguement");
	}
	public void show(int...a) {//...(can take any number of arguements)
		System.out.println("more than one arguements");
	}
	public void show(int a,float b) {
		System.out.println("two arguement");
	}
	public void show(long...a) {//...(can take any number of arguements)
		System.out.println("more than one arguements");
	}
	
}

public class ObjectDemo3 {
	public static void main(String[] args) {
		Case4 ob=new Case4();
		ob.show(10);
		ob.show(10,20,30);
		ob.show('a','v');
		ob.show(20, 16.50f);
		ob.show(2345l,42567l);
//		ob.show(3.55f,4.5f);
//		ob.show("Hemanth","ashika");
	}

}
