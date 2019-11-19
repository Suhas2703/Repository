package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Collections;

class Main {

	public static void main(String[] args) {
		ArrayList<P1> al=new ArrayList<>();
		P1 ob1=new P1(50);
		al.add(ob1);
		P1 ob2=new P1(20);
		al.add(ob2);
		System.out.println("Before sorting");
		System.out.println(al);
		System.out.println("After sorting");
		Collections.sort(al);
		System.out.println(al);

	}

}
