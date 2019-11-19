package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Collections;
class AL12 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(2);
	al.add(100);
	//Before sorting
	System.out.println(al);
	//After sorting
	Collections.sort(al);
	System.out.println(al);
	}

}
