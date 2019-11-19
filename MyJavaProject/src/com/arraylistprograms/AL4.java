package com.arraylistprograms;

import java.util.ArrayList;

class AL4 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		System.out.println(al);
	//	al.add("hello"); can't add other than integer as it is generic
		ArrayList<Boolean> a= new ArrayList<>();
		a.add(true);
		a.add(false);
		System.out.println(a);
	}
	
}
