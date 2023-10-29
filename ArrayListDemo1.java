package collectionlist;
import java.util.ArrayList;
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("cat");
		a1.add("Dog");
		a1.add("Cow");
		a1.add("Goat");
		System.out.println(a1);
		
		//copying values from one arraylist to another
		ArrayList<String> b1=new ArrayList<String>();
		b1.addAll(a1);
		System.out.println(b1);
		
		//removeAll()
		ArrayList<String> c1=new ArrayList<String>();
		c1.removeAll(b1);
		System.out.println(c1);
	}
}
