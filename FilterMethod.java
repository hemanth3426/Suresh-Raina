package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterMethod {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(20);
		al.add(22);
		al.add(21);
		al.add(27);
		al.add(19);
		System.out.println("List:"+al);
		
		//even numbers
		List<Integer>EvenNumbers=al.stream().filter((i)->i%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers:"+EvenNumbers);
		
		//odd numbers
		List<Integer>OddNumbers=al.stream().filter((i)->i%2!=0).collect(Collectors.toList());
		System.out.println("Odd Numbers:"+OddNumbers);
		
		//ascending order
		List<Integer>AscendingOrder=al.stream().sorted((i1,i2)->i1.compareTo(i2))./*or sorted().*/collect(Collectors.toList());
		System.out.println("Ascending Order:"+AscendingOrder);
		
		//descending order
		List<Integer>DescendingOrder=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Descending Order:"+DescendingOrder);
		
		//sorting only even
		List<Integer>SortingEven=al.stream().filter((i)->i%2!=0).sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Descending Order:"+SortingEven);
		
		//sorting only odd
		List<Integer>SortingOdd=al.stream().filter((i)->i%2!=0).sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Descending Order:"+SortingOdd);
		
		//map
		List<Integer>UpdatedNumber=al.stream().map((i)->i+5).collect(Collectors.toList());
		System.out.println("Updated Number is:"+UpdatedNumber);
		
		//max value
		Integer MaxValue=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max Value is:"+MaxValue);
		
		//min value
		Integer MinValue=al.stream().min((i1,i2)->i2.compareTo(i1)).get();
		System.out.println("Min Value is:"+MinValue);
			
	}
} 
