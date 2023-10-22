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

class District extends State{
	public void districtmethod() {
		System.out.println("Mandya");
	}
}
public class MultiLevel {
	public static void main(String[] args) {
    District ob=new District();
    ob.countrymethod();
    ob.statemethod();
    ob.districtmethod();
    
	}
}
