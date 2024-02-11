package com.composition.destroyownobj;

public class Page {
	String Content;
	Page(String Content)
	{
		this.Content=Content;
	}
	void display()
	{
		System.out.println("Page Content is:"+Content);  
	}

}
