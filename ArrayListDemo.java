package collectionlist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
//		ArrayList<String> al1=new ArrayList<String>();
//		List<String>l=new ArrayList<String>();
		ArrayList a1=new ArrayList();
		a1.add("Hemanth");
		a1.add(100);
		a1.add(200l);
		a1.add(12.3f);
		a1.add(true);
		a1.add(14.5);
		System.out.println("After inserting values "+a1);
		
		//using index value
//		a1.add(0,"Gowda");
		System.out.println(a1);
		
		//a1.contains(100)
		System.out.println(a1.contains(10));
		
		//for loop 
//		for(int i=0;i<a1.size();i++) {
//			System.out.println(a1.get(i));
//		}
		
		//for each loop
//		for(Object o:a1) {
//			System.out.println(o);
//		}
		
		//iterator
//		Iterator itr=a1.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
	}
}
