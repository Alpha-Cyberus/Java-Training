package theCompleteJavaCertificationCourseUdemy;

public class Concurrency {

	public static void main(String[] args) {
//		Option 1 for creating a thread
		System.out.println("Start thread 1");
		Thread t1 = new Thread(new Task("Thread-A"));
		t1.start(); 

//		Option 2 for creating a thread
		System.out.println("Start thread 2");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					System.out.println("["+Thread.currentThread().getName()+"] Number: " + i);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t2.start();
	}
}

class Task implements Runnable {
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i=0; i<100; i++) {
			System.out.println("["+Thread.currentThread().getName()+"] Number: " + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
