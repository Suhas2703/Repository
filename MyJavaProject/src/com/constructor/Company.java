package com.constructor;

class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob1=new Employee("A",400,1);
		System.out.println("Name:"+ob1.Name+" Salary:"+ob1.Salary+" id:"+ob1.id);
		Employee ob2=new Employee("B",300,2);
		System.out.println("Name:"+ob2.Name+" Salary:"+ob2.Salary+" id:"+ob2.id);
		Employee ob3=new Employee("C",200,3);
		System.out.println("Name:"+ob3.Name+" Salary:"+ob3.Salary+" id:"+ob3.id);
	}

}
