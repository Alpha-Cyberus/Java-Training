package theCompleteJavaCertificationCourseUdemy;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tim");
		cust1.setAddress("Over There");
		cust1.setMoney(10);
		
		Vehicle veh = new Vehicle();
		veh.setModel("Reliant Robin");
		veh.setYear(1980);
		veh.setColor("green");
		veh.setPrice(100);
		
		
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(veh, emp, true);
	}
}