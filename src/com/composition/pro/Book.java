package com.composition.pro;

public class Book {
	Page pg;
	Book()
	{
		//creating the object of composition in under  Owner object class
	  pg=new Page("Java Content");
	  
	}
	void read()
	{
		System.out.println("reading book");
		pg.display();
	}

}
