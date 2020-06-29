package com.qa.Inheritance;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class Car extends vehicle {

	final int MAX_SPEED = 100; 
	//Ip address for GCP
	//username 
	//password
	//
	
	public static void main(String[] args) {
		
		vehicle brum = new Car();
		
		
	
		
		brum.setTopSpeed(42);
		brum.setColour("Blue");
//		System.out.println(brum.getColour());
		System.out.println(brum.speed(40));
		brum.carNoise();
//		Car.carNoise();
		
//		brum.numberOfGears();

	}
	
	public void carNoise() {
		System.out.println("Bang Bang clang clang");
	}
	
	public void numberOfGears() {
		System.out.println("This car had 6 gears");
	}
	

}
