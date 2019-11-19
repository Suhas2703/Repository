package com.arraylistprograms;

import java.util.ArrayList;

class AL2 {
	public static void main(String[] args) {
		
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add("hello");//heterogeneous allowed
	System.out.println(ls.add(10));
	System.out.println(ls.add(null));
	System.out.println(ls);
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i));
	}
	
	}
}
