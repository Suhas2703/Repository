package com.exceptions;

public class E1 {
public static void main(String[] args) {
	System.out.println("Main started");
	int a=10;
	System.out.println(1);
	int b=0;
	System.out.println(2);
	try {
	int c=a/b;//exception calling statements
	}
	catch(ArithmeticException e)
	{
		System.out.println("Caught");
	}
	System.out.println(3);
	System.out.println("main ends");
}
}
