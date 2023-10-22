package inheritence;

class Country{
	public void countrymethod() {
		System.out.println("India");
	}
}

class State extends Country{
	public void statemethod() {
		System.out.println("Karnataka");
	}
}

class State1 extends Country{
	public void state1method() {
		System.out.println("Kerala");
	}
}
public class Heirarchical {
	public static void main(String[] args) {
		State1 ob1=new State1();
		State ob=new State();
		ob1.countrymethod();
		ob1.state1method();
		ob.statemethod();

	}
}
