package com.arraylistprograms;
import java.util.ArrayList;

class AL7 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		for(Object x: al)
		{
			if(x instanceof Integer);
			Integer i=(Integer)x;
			System.out.println(i+2);
		}
	}

}
