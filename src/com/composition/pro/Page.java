package com.composition.pro;

public class Page {
	String Content;
	Page(String Content)
	{
		this.Content=Content;
	}
	void display()
	{
		System.out.println("page content is;"+Content);
	}

}
