package thread;

class MyThread2 extends Thread{
		public void run() {
		for(int i=0;i<=10;i++) {
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
		MyThread2 ob=new MyThread2();//first thread
		ob.start();
		System.out.println("Id of the thread:"+ob.getId());
		ob.setName("Hemanth");
		System.out.println("My thread name after setting:"+ob.getName());
		System.out.println("Priority of Thread is:"+ob.getPriority());
		ob.setPriority(1);
		System.out.println("priority after setting:"+ob.getPriority());
//		min priority-1,normal-5,max-10.
		System.out.println();
		
		ob.join();
		MyThread2 ob1=new MyThread2();//second thread
		ob1.start();
		System.out.println("Id of the thread:"+ob1.getId());
		ob1.setName("Hemanth");
		System.out.println("My thread name after setting:"+ob1.getName());
		System.out.println("Priority of Thread is:"+ob1.getPriority());
		ob1.setPriority(1);
		System.out.println("priority after setting:"+ob1.getPriority());
	}
}
