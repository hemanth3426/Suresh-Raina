package thread;

class MyThread extends Thread{
	
//	public void run() {
//		for(int i=0;i<=10;i++) {
//		System.out.println("Hello");
//	}
//}
//}
//public class ThreadDemo {
//	public static void main(String[] args) {
//		MyThread ob=new MyThread();
//		ob.start();
//	}
//}

public void run() { 
	System.out.println("Hello");
    }
public void run(int a) {
	System.out.println("World");
    }
public void run(int a,int b) {
	System.out.println("Wellcome");
    }
}
public class ThreadDemo {
public static void main(String[] args) {
	MyThread ob=new MyThread();
	ob.start();
	ob.run(1);
	ob.run(1,2);
    }
}
