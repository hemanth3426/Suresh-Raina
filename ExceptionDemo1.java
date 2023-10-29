package exception;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
		String b="Hemanth";
//		int y=b.length();
		System.out.println(b);
			
		String a=null;//NullPointerException
		int x=a.length();
		System.out.println(x);
		
//		int x[]= {1,2,3,4};//ArrayIndexOutOfBoundsException
//		System.out.println(x[4]);
		
//		int z[]= {10,20,30,40};
//		System.out.println(z[3]);
		}
		catch(Exception ob)
		{
			System.out.println(ob);
		}
		System.out.println("10");
		
		int z[]= {10,20,30,40};
        System.out.println(z[3]);
		
		
	}

}
