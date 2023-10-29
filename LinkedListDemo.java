package collectionlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("ravi");
		li.add(300);
		li.add('A');
		li.add(30.5);
		System.out.println(li);
		
		//addFirst,addLast,
		li.addFirst("Hemanth");
		li.addLast("Gowda");
		
		System.out.println(li);
		
		//removeFirst,removeLast()
	
		System.out.println(li.removeFirst());
		System.out.println(li.removeLast());
		System.out.println("after removing "+li);
		
		//insertion order cannot be done in linked list
	
	}

}