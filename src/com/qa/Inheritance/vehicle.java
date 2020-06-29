package com.qa.Inheritance;

public class vehicle {
	
	private String colour;
	private int numberWheels;
	private int topSpeed;
	private String model;
	private String make;
	private int year;
	private double engineSize;
	
	
	public vehicle(String c, int numberWheels, int topSpeed, String model, String make, int year,
			double engineSize) {
		super();
		this.colour = c;
		this.numberWheels = numberWheels;
		this.topSpeed = topSpeed;
		this.model = model;
		this.make = make;
		this.year = year;
		this.engineSize = engineSize;
	}
	
	
	
	public void carNoise() {
		System.out.println("BRMMMMMMMMMMMMMMMM");
	}
	
	public void numberOfGears() {
		System.out.println("this vehicle has some gears.");
	}
	


	public String getColour() {
		return colour;
	}
	
	public boolean drive() {
		return false;
	}
	
	public int speed(int speed) {
		return speed/5*topSpeed;
	}


	public void setColour(String colour) {
		
		this.colour = colour;
	}


	public int getNumberWheels() {
		return numberWheels;
	}


	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}


	public int getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getEngineSize() {
		return engineSize;
	}


	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}



	public vehicle() {
		super();
	}
	
	

	
	
	
}
