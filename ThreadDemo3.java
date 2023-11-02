package thread;

public class ThreadDemo3 {
	public synchronized void wish(String name) throws InterruptedException{
		for(int i=0;i<=5;i++) {
			Thread.sleep(1000);
			Thread.yield();
			System.out.println("Hello "+name);
		}
	}
}
