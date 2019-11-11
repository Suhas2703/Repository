package com.polymorphism;

class MainClass {
	public static void main(String[] args) {
		A ob;
		ob=new A();
		ob.test();// from test() of A
		ob=new B();// upcasting
		ob.test();// Polymorphism
		ob=new C();// upcasting
		ob.test();// Polymorphism
	}
}
