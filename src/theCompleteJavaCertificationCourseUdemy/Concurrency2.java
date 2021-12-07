package theCompleteJavaCertificationCourseUdemy;

public class Concurrency2 {

	public static void main(String[] args) {
		
		Sequence sequence = new Sequence();
		
		Worker w1 = new Worker(sequence);
		w1.start();
		
		Worker w2 = new Worker(sequence);
		w2.start();
	}
}

class Worker extends Thread{
	
	Sequence sequence = null;
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " got value: " + sequence.getNext());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}