package com.nonprimitivearray;

class BookStore 
{

	public static void main(String[] args) 
	{
		Books[]shelf= {new Books("The Silent Patient ",1450,1),
				new Books(" The Girl in the Train ",1550,2),
				new Books(" Before I go to Sleep ",1650,3),
				new Books(" Woman in the Window ",1750,4),
				new Books(" The Wife between Us ",1850,5)};
		for(int n=0;n<shelf.length;n++) 
		{
		System.out.println(shelf[n].name+" "+shelf[n].price+" "+shelf[n].isbn);
		shelf[n].thriller();
		}
	}

}
