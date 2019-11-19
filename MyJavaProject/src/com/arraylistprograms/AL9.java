package com.arraylistprograms;

import java.util.ArrayList;
import java.util.Iterator;

class AL9 {
public static void main(String[] args) {
 ArrayList al=new ArrayList();
 al.add(10);
 al.add(20);
 al.add(30);
 al.add("hello");
 Iterator t=al.iterator();
		 while(t.hasNext())
		 {
			 Object ob=t.next();
			 if(ob instanceof Integer)
			 {
				 Integer x=(Integer)ob;
				 System.out.println(x+2);
			 }
			 if(ob instanceof String)
			 {
				 String s=(String)ob;
				 System.out.println(s+"world");
			 }
		 }
}
}
