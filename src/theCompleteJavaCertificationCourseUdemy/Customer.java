package theCompleteJavaCertificationCourseUdemy;

public class Customer {
	
	private String name;
	private String address;
	private double money;
	
	public void purchaseCar(Vehicle ve, Employee em, boolean finance) {
		em.handleCustomer(this, finance, ve);
	}
	
	public String getName() {return name;}
	public String getAddress() {return address;}
	public double getMoney() {return money;}
	
	public void setName(String name) {this.name = name;}
	public void setAddress(String address) {this.address = address;}
	public void setMoney(double money) {this.money = money;}
}
