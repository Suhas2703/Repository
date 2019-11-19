package com.arraylistprograms;

class Bike {
	String colour;
	double mileage;
	public Bike() 
	{
		
	}
	public Bike(String colour, double mileage) 
	{
		this.colour = colour;
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Bike [colour=" + colour + ", mileage=" + mileage + "]";
	}
	
}
