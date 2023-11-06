package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10000);
		al.add(20000);
		al.add(25000);
		al.add(15000);
		al.add(18000);
		System.out.println("Employee Salary Initially:"+al);
		
		List<Integer>UpdatedSalary=al.stream().map((i)->i+3000).collect(Collectors.toList());
		System.out.println("Updated Salary:"+UpdatedSalary);
		
		long count=al.stream().count();
		System.out.println(count);
}
}
