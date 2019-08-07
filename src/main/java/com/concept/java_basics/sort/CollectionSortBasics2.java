package com.concept.java_basics.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CollectionSortBasics2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(434, "akanksha", "bvishnu.baghel91@gmail.com", new Date());
		Employee emp2 = new Employee(545, "arpit", "evishnu.baghel91@gmail.com", new Date());
		Employee emp3 = new Employee(112, "vishal", "cvishnu.baghel91@gmail.com", new Date());
		Employee emp4 = new Employee(134, "vishnu", "dvishnu.baghel91@gmail.com", new Date());

		List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4);

		Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));

		for (Employee employee : employees) {
			System.out.println("Id : " + employee.getId() + ", name : " + employee.getName() + ", email : "
					+ employee.getEmail() + ", DOJ :" + employee.getDoj());
		}

	}
}



class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String email;
	private Date doj;

	public Employee(int id, String name, String email, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int compareTo(Employee employee) {
		return this.id - employee.id;
	}

}

@FunctionalInterface
interface MComparator<T> {
	
	int compare (T o1, T o2);
}

/**
 * (Integer o1, Integer o2) -> {return o1.compareTo(o2)}
 * 
 * */
