package collectionlist;
import java.util.*;
public class SetDemo {
//set is an interface->1.Hashset(c),2.linkedset(c)
//insertion order not preserved
//duplicate values not allowed
	public static void main(String[] args) {
		HashSet ob=new HashSet();//hetero
//		LinkedHashSet<String> ob1=new LinkedHashSet<>();//home
//		Set ob2=new HashSet();
		ob.add("Hemanth");
		ob.add(100);
		ob.add('H');
		ob.add(3.5);
		System.out.println(ob);
		
		ob.add("gowda");
		System.out.println("After Adding "+ob);
		
		ob.remove(100);
		System.out.println("After remove "+ob);
		
		//to check contains
		System.out.println(ob.contains('I'));
		
		System.out.println(ob.add(null));
		System.out.println();
		
		//for loop
//    	for(int i=0;i<=ob.size();i++)
//    	{
//        System.out.println(ob.get(i));//to get the value we hv to do getter
//    	}
        
        //for each loop
		for(Object o:ob)
		{
		System.out.println(o);
		}
		System.out.println();
		
		//iterator
		Iterator itr=ob.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
    }
}
}


