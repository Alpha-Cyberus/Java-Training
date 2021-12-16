package theCompleteJavaCertificationCourseUdemy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpools {
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable processor0 = new MessageProcessor(4);
		executor.execute(processor0);
		
		Runnable processor1 = new MessageProcessor(7);
		executor.execute(processor1);
		
		Runnable processor2 = new MessageProcessor(11);
		executor.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(43);
		executor.execute(processor3);
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {}
		
		System.out.println("Complete.");
		
	}

}
