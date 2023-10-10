
package Operaters;
// |(or),&(and),^(xor),~(compliment)
public class BitwiseOperater {
	public static void main(String[] args) {
		int a=4;
		int b=5;
		int c=a|b;
		int d=a&b;
		int e=a^b;
	    int f=~100;
	    int g=~-100;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}
}
