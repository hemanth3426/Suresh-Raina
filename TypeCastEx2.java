package TypeCast;
//
public class TypeCastEx2 {
	public static void main(String[] args) {
		int x[]= {1,2,3,4,5};
		System.out.println(x[3]);
		System.out.println("the length of an array:"+x.length);
		
		//to check length
		String s[]= {"a","aa","aaa"};
		System.out.println(s.length);
		System.out.println(s[2].length());
		
		//shallow copy clone method
		int y[][]= {{1,2,3,4,5,6},{7,8,9}};
		System.out.println(y[1].length);
		System.out.println(y[0].length);
	
	}
}
