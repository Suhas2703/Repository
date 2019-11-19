package com.arraylistprograms;

class Vehicle {
	String colour;
	int speed;
	public Vehicle() {
	}
	public Vehicle(String colour, int speed) {
		this.colour = colour;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", speed=" + speed + "]";
	}
	
	
}
