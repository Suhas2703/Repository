package com.arraylistprograms;
import java.util.ArrayList;

class AL8 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		System.out.println(al);
		for(Integer i:al)
		{
			System.out.println(i+2);
		}
	}

}
