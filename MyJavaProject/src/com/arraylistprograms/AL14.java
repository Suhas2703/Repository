package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Collections;

class AL14 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		Object[] ob=al.toArray();
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
		}
	}
}
