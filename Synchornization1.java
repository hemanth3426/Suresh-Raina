package thread;

class Display1 extends Thread{
	public synchronized void wish(String name) throws InterruptedException{
		for(int i=0;i<=5;i++) {
			System.out.println("The Best "+name);
			Thread.sleep(1000);
			Thread.yield();
		}
	}
}
class MyThread4 extends Thread{
	Display1 d1;
	String name;
	//constructor
	public MyThread4(Display1 d1, String name) {
		super();
		this.d1 = d1;
		this.name = name;
	}
	public void run() {
		try {
		d1.wish(name);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
public class Synchornization1 {
	public static void main(String[] args) {
		Display1 ob=new Display1();
		MyThread4 t1=new MyThread4(ob,"Batsman Kohli");
		t1.yield();
		t1.start();
		MyThread4 t2=new MyThread4(ob,"Bowler Bumrah");
		t2.yield();
		
		MyThread4 t3=new MyThread4(ob,"All-rounder Jadeja");
		t3.start();
	}
}
//yeild will suspend chance for current thread give chance to other thread
//join will give chance for current thread other threads in waiting