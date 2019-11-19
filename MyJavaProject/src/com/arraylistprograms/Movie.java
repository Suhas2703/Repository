package com.arraylistprograms;

class Movie {
	String name;
	double rating;
	public Movie() {
		
	}
	public Movie(String name, double rating) {
		this.name = name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + "]";
	}
	
}
