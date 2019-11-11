package com.polymorphism;

class Main {

	public static void main(String[] args) {
		{Bank bank;
		bank =new SBI();
		System.out.println(bank.roi());
		bank=new Canara();
		System.out.println(bank.roi());
		bank=new SBIInTouch();
		System.out.println(bank.roi());
		bank=new ICICI();
		System.out.println(bank.roi());}
		// BY USING ARRAY
		{Bank[] b=new Bank[5];
		b[0]=new SBI();
		b[1]=new ICICI();
		b[2]=new Canara();}
	}
	
}
