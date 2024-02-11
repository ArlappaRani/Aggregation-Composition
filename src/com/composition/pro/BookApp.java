package com.composition.pro;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the owner object
		Book bk=new Book();
		bk.read();
		//calling the display method of composition obj
		bk.pg.display();

	}

}
