package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Collections;

class AL13 {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();	
	al.add("S");
	al.add("D");
	al.add("A");
	System.out.println("Before sorting");
	System.out.println(al);
	System.out.println("After sorting");
	Collections.sort(al);
	System.out.println(al);
	}

}
