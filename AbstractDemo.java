package abstractmethod;

abstract class Fruits{
	abstract void taste();
}
class Mango extends Fruits{
	void taste() {
		System.out.println("Mango is Sweet ");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Mango ob=new Mango();
		ob.taste();
	}
}
