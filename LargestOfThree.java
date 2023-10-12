
package Examples;

public class LargestOfThree {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		int c=30;
		
		 int max=(a>b && a>c)?a:
          	    (b>a && b>c)?b:c;
		 
		 int min=(a<b && a<c)?a:
			     (b<c && b<a)?b:c;
		 
		 System.out.println(max);
		 System.out.println(min);
	}

}
