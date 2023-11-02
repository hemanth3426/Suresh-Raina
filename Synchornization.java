package thread;
//to achieve the synchronization
//synchronized keyword,method,block
class Display extends Thread{
	public synchronized void wish(String name) throws InterruptedException{
		for(int i=0;i<=5;i++) {
			System.out.println("Good Morning "+name);
			Thread.sleep(500);
			Thread.yield();
		}
	}
}
class MyThread3 extends Thread{
	Display d;
	String name;
	//constructor
	public MyThread3(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run() {
		try {
		d.wish(name);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
public class Synchornization {
	public static void main(String[] args) {
		Display ob=new Display();
		MyThread3 t1=new MyThread3(ob,"Hemanth");
		MyThread3 t2=new MyThread3(ob,"Sreteja");
		MyThread3 t3=new MyThread3(ob,"Jayanth");
		t1.start();
		t2.start();
		t3.start();
	}
}

