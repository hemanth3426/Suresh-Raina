package thread;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Helllo");
		}
	}
	
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread1 ob=new MyThread1();
		Thread t=new Thread(ob);//when using runnable method we cannot use directly start so create thread
		t.start();
  }
}