package com.aggregation.destroyownobj;

public class AirlineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilot p=new Pilot("Raju");
		p.fly();
		Airline ar=new Airline("FastAir",p);
		ar.operations();
		System.out.println("Destroying the Airline object");
		ar=null;
		//ar.operations();error bcz will not call owner methods
		p.fly();//owner is destroyed then also aggregte obj not destroy
		

	}

}
