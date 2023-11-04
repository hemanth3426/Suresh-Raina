package lamdaexpression;

interface Demo{
	public void display();
}

public class LamdaDemo {
	 public static void main(String[] args) {
		 Demo ob=() -> System.out.println("Hello");
		 ob.display();
	 }
}

	
