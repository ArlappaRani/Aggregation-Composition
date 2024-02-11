package com.composition.destroyownobj;

public class Book {
	Page pg;
	Book()
	{
		pg=new Page("Java Content");
	}
	void read()
	{
		System.out.println("Reading book");
		pg.display();
	}

}
