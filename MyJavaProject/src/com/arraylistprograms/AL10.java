package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class AL10 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		Iterator<Integer> t=al.iterator();
		while(t.hasNext())
		{
			Integer x=t.next();
			System.out.println(x+2);
		}
		

	}

}
