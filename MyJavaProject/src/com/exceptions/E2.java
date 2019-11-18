package com.exceptions;

public class E2 {
	int i;
public static void main(String[] args) {
	System.out.println(1);
	E2 ob=null;
	System.out.println(2);
	try {
	System.out.println(ob.i);//null pointer exception
	}
	catch(NullPointerException e)
	{
		System.out.println("Caught");
	}
	System.out.println(3);
}
}
