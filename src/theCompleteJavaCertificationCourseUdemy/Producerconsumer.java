package theCompleteJavaCertificationCourseUdemy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producerconsumer {
	
	public static void main(String[] args) {
//		Lesson 2
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);
		Thread t1 = new Thread(new Producer(questionQueue));
		Thread t2 = new Thread(new Consumer(questionQueue));
		
		t1.start();
		t2.start();
		
		
//		Lesson 1
//		List<Integer> questionList = new ArrayList<Integer>();
//		
//		Thread t1 = new Thread(new Producer(questionList));
//		Thread t2 = new Thread(new Consumer(questionList));
//		
//		t1.start();
//		t2.start();
		
		
		
	}

}
