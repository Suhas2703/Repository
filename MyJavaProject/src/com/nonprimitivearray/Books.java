package com.nonprimitivearray;

class Books {
	String name;
	int price;
	int isbn;
	Books(String name,int price,int isbn)
	{
		this.name=name;
		this.price=price;
		this.isbn=isbn;
	}
	void thriller()
	{
		System.out.println(name+" this book is of thriller genre");
	}
}
