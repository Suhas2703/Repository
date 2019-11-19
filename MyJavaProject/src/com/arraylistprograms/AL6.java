package com.arraylistprograms;

import java.util.ArrayList;

class AL6 {
//WITH GENERIC
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		for(int i=0;i<al.size();i++)
		{
			Integer y=al.get(i);
			System.out.println(y+2);
		}
	}

}
