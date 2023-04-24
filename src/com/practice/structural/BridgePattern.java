package com.practice.structural;

public class BridgePattern {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car(new Produce(), new Assemble());
		car.manufacture();
		
		
		Vehicle bike = new Bike(new Produce(), new Assemble());
		bike.manufacture();
		
	}

}


abstract class Vehicle{
	
	Workshop workshop1;
	Workshop workshop2;
	public Vehicle(Workshop workshop1, Workshop workshop2) {
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}
	

	abstract void manufacture();

	
}

class Car extends Vehicle{
	public Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}
	@Override
	void manufacture() {
		// TODO Auto-generated method stub
		System.out.print("Car ");
		workshop1.work();
		workshop2.work();
		
	}
	
}

class  Bike extends Vehicle{

	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	void manufacture() {
		// TODO Auto-generated method stub
		
		System.out.print("Bike");
		workshop1.work();
		workshop2.work();
		
	}
	
	
	
}




interface Workshop{
	void work() ;
	
}

class Produce implements Workshop{

	@Override
	public void work() {
		
		System.out.print(" Items produced");
		
	}
	
}

class Assemble implements Workshop{

	@Override
	public void work() {
		
		System.out.println(" And assembled");
		
	}
	
}
