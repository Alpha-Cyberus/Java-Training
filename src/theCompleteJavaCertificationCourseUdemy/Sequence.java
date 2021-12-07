package theCompleteJavaCertificationCourseUdemy;

public class Sequence {
	
	private int val = 0;
	
	public synchronized int getNext() {
		val++;
		return val;
	}
}
