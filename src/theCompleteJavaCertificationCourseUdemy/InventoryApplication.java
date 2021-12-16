package theCompleteJavaCertificationCourseUdemy;

public class InventoryApplication {

	public static void main(String[] args) throws InterruptedException {
		InventoryManager manager = new InventoryManager();
		
		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.populateSoldProducts();
			}
		});
		
		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.displaySoldProducts();
			}
		});
		
		inventoryTask.start();
		Thread.sleep(200);
		displayTask.start();
	}
}
