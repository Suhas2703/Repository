package com.abstractclass;

class Dog extends Animal{
	Dog()
	{
		
	}
	Dog(double height,double weight){
		super(height,weight);
	}
	@Override
	void talk() 
	{
		System.out.println("Bow bow bowwwwwwwwwwwwwwww");
	}
}
