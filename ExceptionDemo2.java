package exception;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try
		{
			Class.forName("Exception.Demo");
			System.out.println("Class Found");
		}
		catch(Exception ob)
		{
//		ob.printStackTrace();
		System.out.println(ob);
		}
	}
}
