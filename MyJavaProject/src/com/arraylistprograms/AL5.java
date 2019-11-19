package com.arraylistprograms;

import java.util.ArrayList;
//WITHOUT GENERIC
class AL5 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		for(int i=0;i<al.size();i++)
		{
			Object x=al.get(i);
			Integer y=(Integer)x;
			int z=y;
			System.out.println(z+2);
		}

	}

}
