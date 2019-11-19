package com.arraylistprograms;

import java.util.ArrayList;

class HetroAL {
	public static void main(String[] args) {
		ArrayList hetro=new ArrayList();
		hetro.add(new Bike("Red",60.0));
		hetro.add(new Employee(1,"Suhas"));
		Movie m=new Movie("Bala",4.8);
		hetro.add(m);
		hetro.add(10);
		System.out.println(hetro);
	}
}
