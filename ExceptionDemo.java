package exception;
//it is event occure only in runtime
//exception used to stop abnormal termination of programm
//types->Checked,unchecked,error exception
//exception handles by keywords->try,catch,throw,throws,finally
public class ExceptionDemo {
	public static void main(String[] args) {
		try 
		{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println(4/0);
//		System.out.println("5");
//		System.out.println("6");
//		System.out.println("7");
		}
		catch(Exception ob) 
		{
//			ob.printStackTrace();//to trace the exception
			System.out.println(ob);
		}
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
	}

}
