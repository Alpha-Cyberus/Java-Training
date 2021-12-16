package theCompleteJavaCertificationCourseUdemy;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
//	Lesson 2
	int questionNo;
	
	BlockingQueue<Integer> questionQueue;
	
	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}
	
	
//	Lesson 1
//	List<Integer> questionList = null;
//	final int LIMIT = 5;
//	private int questionNo;
//	
//	public Producer(List<Integer> questionList) {
//		this.questionList = questionList;
//	}
//	
//	public void readQuestion(int questionNo) throws InterruptedException{
//		synchronized(questionList) {
//			while(questionList.size() == LIMIT) {
//				System.out.println("Questions have piled up. Wait for answers.");
//				questionList.wait();
//			}
//		}
//		
//		synchronized(questionList) {
//			System.out.println("New Question" + questionNo);
//			questionList.add(questionNo);
//			Thread.sleep(100);
//			questionList.notify();
//		}
//	}
	
	@Override
	public void run() {
		
//		Lesson 2
		while(true) {
			try {
				synchronized(this) {
					int nextQuestion = questionNo++;
					System.out.println("New question: " + nextQuestion);
					questionQueue.put(nextQuestion);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
//		Lesson 1
//		while(true) {
//			try {
//				readQuestion(questionNo++);
//			} catch (InterruptedException e) {
//			}
//		}
//	}
}
