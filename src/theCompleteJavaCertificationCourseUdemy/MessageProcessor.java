package theCompleteJavaCertificationCourseUdemy;
//test2
public class MessageProcessor implements Runnable {
	private int message;
	
	public MessageProcessor(int message) {
		this.message = message;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " [Received] Message = " + message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName() + " [Processed] Message = " + message);
	}

	private void respondToMessage() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println("Unable to process message: " + message);
		}
	}

}
