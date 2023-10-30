package collectionlist;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String>ob=new PriorityQueue<>();
		PriorityQueue<Integer>ob1=new PriorityQueue<>();
		ob.add("Gill");
		ob.add("Rohit");
		ob.add("Kohli");
		ob.add("Rahul");
	
//		ob1.add(1);
//		ob1.add(2);
//		ob1.add(3);
//		ob1.add(4);
		
		System.out.println(ob.add("Iyer"));
		System.out.println(ob);
		System.out.println();
		
		System.out.println(ob.remove("Iyer"));
		System.out.println(ob);
		System.out.println();
		
		ob.offer("Surya");
		ob.offer("Hardik");
		ob.offer("Jadeja");
		System.out.println(ob);
		System.out.println();
		
		System.out.println(ob.contains("Kuldeep"));
		System.out.println(ob);
		System.out.println();
		

		System.out.println(ob.element());
		System.out.println(ob);
		
		System.out.println(ob.poll());
		System.out.println(ob);
		
		System.out.println(ob.peek());
		System.out.println(ob);
		
	}
}
