package com.qa.polymorphism.animal;

public class Animal {

	private String name = "MyPet";
	private int age =1;
	private int speed;
	
	
	public Animal() {
	}


	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public Animal(int speed) {
		this.speed = speed;
	}
	
	public Animal(int age,String name, int speed) {
		this.age = age;
		this.name = name;
		this.speed = speed;
	}
	
	
	
	public int run() {
		return speed *200;
	}
	
	public int run(int speed2) {
		return speed2 *speed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}
