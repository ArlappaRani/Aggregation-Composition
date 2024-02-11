package com.composition.destroyownobj;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk=new Book();
		bk.read();
		bk.pg.display();
		bk=null;
		//bk.read();//error bcz already bk object is null
		//bk.pg.display();//error
		

	}

}
