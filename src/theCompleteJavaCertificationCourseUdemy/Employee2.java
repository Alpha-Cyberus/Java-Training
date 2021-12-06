package theCompleteJavaCertificationCourseUdemy;

public class Employee2 implements Comparable<Employee2>{
//	This class to go with CompareToExample
	String name;
	int salary;
	String department;
	
	public Employee2(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
//	This override of Comparable gives the class some standardized way of organizing itself. 
	public int compareTo(Employee2 e) {
		if (this.salary < e.salary) {
			return -1;
		} else if (this.salary < e.salary) {
			return 1;
		}
		return 0;
	}

//	This override prints out the actual details of the object rather than just a hash code
	public String toString() {
		return "Employee2 [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
}
