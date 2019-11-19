package com.arraylistprograms;

class Employee {
	int id;
	String name;
	public Employee() {
		
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	} //if you want to see id and name then only Override else it is not mandatory
	
	
	
}
