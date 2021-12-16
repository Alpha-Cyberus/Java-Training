package theCompleteJavaCertificationCourseUdemy;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
//	Lesson 2
	BlockingQueue<Integer> questionQueue;
	
	public Consumer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}
	
//	Lesson 1
//	List<Integer> questionList = null;
//	
//	public Consumer(List<Integer> questionList) {
//		this.questionList = questionList;
//	}
//	
//	public void answerQuestion() throws InterruptedException{
//		synchronized(questionList) {
//			while(questionList.isEmpty()) {
//				System.out.println("Waiting for questions.");
//				questionList.wait();
//			}
//		}
//		
//		synchronized(questionList) {
//			Thread.sleep(1000);
//			System.out.println("Answered Question" + questionList.remove(0));
//			questionList.notify();
//		}
//	}

	@Override
	public void run() {
		
//		Lesson 2
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("Answered question: " + questionQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
		
//		Lesson 1
//		while(true) {
//			try {
//				answerQuestion();
//			} catch (InterruptedException e) {
//			}
//		}
//	}

}
