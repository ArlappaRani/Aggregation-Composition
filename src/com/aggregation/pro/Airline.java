package com.aggregation.pro;

public class Airline  {
	String brand;
	Pilot p;
	Airline(String brand,Pilot p)
	{
		this.brand=brand;
		this.p=p;
		
	}
	//creating the method
	void operations()
	{
		System.out.println(brand+"is doing the operations");
		p.fly();
	}

}
