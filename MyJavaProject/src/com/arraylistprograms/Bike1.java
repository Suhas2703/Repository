package com.arraylistprograms;

class Bike1 extends Vehicle{
	double mileage;

	public Bike1() {
		super();
	}

	public Bike1(String colour,int speed,double mileage) {
		super(colour,speed);
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Bike1 [mileage=" + mileage + ", colour=" + colour + ", speed=" + speed + "]";
	}
	
}
