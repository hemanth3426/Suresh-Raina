package lamdaexpression;

interface Demo1{
   public int square(int n);
}
public class LamdaDemo1 {
	 public static void main(String[] args) {
		 Demo1 ob=(n)->{return n*n;};
		 ob.square(2);
		 System.out.println("square of the number is "+ob.square(2));
	 }
}
