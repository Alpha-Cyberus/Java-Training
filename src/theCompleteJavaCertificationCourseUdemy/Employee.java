package theCompleteJavaCertificationCourseUdemy;

public class Employee {
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance==true) {
			double loanAmount = vehicle.getPrice() - cust.getMoney();
			runCreditHistory(cust,loanAmount);
		} else if(vehicle.getPrice() <= cust.getMoney()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Customer needs more money");
		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history");
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Purchase complete.");
	}
}
