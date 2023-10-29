package collectionlist;
import java.util.*;
public class SetDemo1 {
	public static void main(String[] args) {
	HashSet<Integer> hashSet = new HashSet<>();
	hashSet.add(1);
	hashSet.add(2);
	hashSet.add(3);
	hashSet.add(3);
	hashSet.add(4);
	hashSet.add(5);

	TreeSet<Integer> treeSet = new TreeSet<>();
	treeSet.add(2);
	treeSet.add(1);
	treeSet.add(3);

	LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
	linkedHashSet.add(2);
	linkedHashSet.add(1);
	linkedHashSet.add(3);

	System.out.println("HashSet: " + hashSet); // Output: [1, 2, 3] (Order can vary)
	System.out.println("TreeSet: " + treeSet); // Output: [1, 2, 3] (Natural order)
	System.out.println("LinkedHashSet: " + linkedHashSet); // Output: [3, 1, 2] (Insertion order)
}
}
