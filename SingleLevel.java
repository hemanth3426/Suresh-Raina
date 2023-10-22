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

public class SingleLevel {
	public static void main(String[] args) {
		State ob=new State();
		ob.countrymethod();
		ob.statemethod();
	}

}


	

