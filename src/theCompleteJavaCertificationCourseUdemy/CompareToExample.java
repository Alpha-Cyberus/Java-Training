package theCompleteJavaCertificationCourseUdemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CompareToExample {
	public static void main(String[] args) {
//		HashSet is a collection which only accepts unique elements, cannot be sorted
		HashSet<Employee2> hashSet = new HashSet<Employee2>();
		hashSet.add(new Employee2("Andy", 1234, "Job"));
		hashSet.add(new Employee2("Bob", 2345, "Job2"));
		hashSet.add(new Employee2("Carl", 3456, "Job3"));
		
//		To sort it, convert it to another collection first
		ArrayList<Employee2> myList = new ArrayList<Employee2>(hashSet);
		
//		Simple integers and strings are easy to sort but objects cannot be
//		unless they implement Comparable to give it something to use as a point of comparison
		Collections.sort(myList);
		System.out.println(myList);
	}
}
