package com.concept.java_basics.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTests {

	public static void main(String[] args) {
		Map<Employee, String> employeeMap = new HashMap<>();

		Employee emp = new Employee("ak12", "ak@gamil.com");

		employeeMap.put(emp, "WIPRO");

		/*
		 * Employee emp2 = new Employee("ak12", "ak@gamil.com");
		 * 
		 * String company = employeeMap.get(emp2);
		 * 
		 * System.out.println(emp.hashCode() + ":" + emp2.hashCode());
		 * 
		 * System.out.println(emp.equals(emp2)); System.out.println(company);
		 */
		
		emp.setEmail("alsdjsalk");
		
		
		String company = employeeMap.get(emp);
		System.out.println(company);
	}

	private static class Employee {

		private String id;
		private String email;

		public Employee(String id, String email) {
			super();
			this.id = id;
			this.email = email;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

	}
}
