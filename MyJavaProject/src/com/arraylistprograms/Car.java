package com.arraylistprograms;

class Car extends Vehicle {
	String fuel;

	public Car() {
	}

	public Car(String colour,int speed,String fuel) {
		super(colour,speed);
		this.fuel = fuel;
	}



	@Override
	public String toString() {
		return super.toString()+ "Car [fuel=" + fuel + "]";
	}
	
	
}
