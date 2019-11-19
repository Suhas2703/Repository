package com.arraylistprograms;

import java.util.ArrayList;

class AL3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add("Hello");
		ls.add(1.0);
		ls.add(new Bike("Black",35.0));
		System.out.println(ls);
	}
}
