package com.qa.oop;

public class Runner {

		// this is your runner - tell java 
	public static void main(String[] args) {
		
//		System.out.println("Start here");
//		Cars vinCar = new Cars("Red", "BMW", "M5", 2018, 100,2); // object 1
//		Cars ahmadsCar = new Cars("Black","Merc","c63 amgs",2020,150,2); // object 2
		Cars newCar = new Cars();
//		newCar.setBrand("Audi");
//		newCar.setColour("green");
////		newCar.setModel("A5");
		newCar.setSpeed(0);
		newCar.setYear(2020);
//		newCar.setNoWheels(0);
		
		System.out.println(newCar);
		
		//System.out.println(vinCar);
//		System.out.println(ahmadsCar);
	//	vinCar.setBrand("Audi");
		//System.out.println(vinCar.getBrand());
		//System.out.println(vinCar);
//		System.out.println(vinCar.drive(123));
		

	}

}
