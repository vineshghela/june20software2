package com.qa.oop;

public class Cars {

	private String colour= "White";
	private String brand= "Some brand";
	private String model = "Some model";
	private int year=2020;
	private int speed;
	private int noWheels = 6;

	public Cars(String colour, String brand, String model, int year, int speed, int noWheels) {
		this.colour = colour;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.noWheels = noWheels;
	}
	//Empty constructor
	public Cars() {

	}
	//noWheels getter
	public int getNoWheels() {
		return noWheels;
	}
	//noWheels setter
	public void setNoWheels(int noWheels) {
		this.noWheels = noWheels;
	}

	@Override
	public String toString() {
		return "Cars colour=" + colour + ", brand=" + brand + ", model=" + model + ", year=" + year
				+ "Number of Wheels " + noWheels;
	}

	public String drive(int speed) {
		if (speed > 120) {
			return "This is really fast";
		} else {
			return "you too slow pal";
		}
	}

	private String engineStatus(boolean bool) {
		if (bool = true) {
			return "Car is on";
		} else {
			return "Car is off";
		}

	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
