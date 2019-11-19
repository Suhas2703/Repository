package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Iterator;

class AL11 {

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	for(int i=0;i<al.size();i++)
	{
		Integer y=al.get(i);
		System.out.println(y);
	}
	System.out.println("**********");
	for(Integer i: al)
	{
		System.out.println(i);
	}
	System.out.println("******");
	Iterator<Integer>t=al.iterator();
	while(t.hasNext())
	{
		Integer x=t.next();
		System.out.println(x);
	}
	System.out.println("*********");
	}

}
