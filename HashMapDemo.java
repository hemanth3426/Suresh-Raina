package map;
//map is standalone Interface
//it consist of key value pair
//here key should not be duplicate
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> ob=new HashMap<>();
		ob.put(101,"Student1");
		ob.put(102,"Student2");
		ob.put(103,"Student3");
		ob.put(104,"Student4");
		ob.put(104,"Student5");
		System.out.println(ob);
		
		System.out.println("After Inserting "+ob.put(105, "Student5"));
		System.out.println(ob);
		System.out.println();
		
		System.out.println(ob.remove(105, "Student5"));//ob.remove(int string)
		System.out.println(ob);
		System.out.println();
		
		System.out.println(ob.remove(102));//ob.remove(object key)
		System.out.println(ob);
		System.out.println();
		
		boolean ob1=ob.containsKey(102);
		System.out.println(ob1);
		System.out.println();
		
		//to get value
	    for(Object ob2:ob.values()) {
	    	System.out.println(ob2);
	    }
	    System.out.println();
	    
	    //to get key
	    for(Object ob3:ob.keySet()) {
	    	System.out.println(ob3);
	    }
	    System.out.println();
	    
	    //to get key and value
	    for(Object ob4:ob.keySet()) {
	    	System.out.println(ob.get(ob4)+" "+ob4);
	    }
	    
		
	}
}
