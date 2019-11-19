package com.arraylistprograms;

import java.util.ArrayList;

public class ParkingLot {

	public static void main(String[] args) {
	ArrayList<Vehicle> v=new ArrayList<>();
	System.out.println(v.isEmpty());
	v.add(new Bike1("Red",120,35.0));
	v.add(new Car("White",320,"diesel"));
	//displaying contents of the ArrayList object
	System.out.println(v);
	//accessing using get()
	for(int i=0;i<v.size();i++)
	{
		Vehicle v1=v.get(i);
		System.out.println(v1.colour);
		System.out.println(v1.speed);
		if(v1 instanceof Bike1)
			System.out.println(((Bike1)v1).mileage);
		if(v1 instanceof Car)
			System.out.println(((Car)v1).fuel);
	}
	System.out.println("______________________");

	}

}
