package com.qa.abstraction;

public abstract class Animal {
	
	abstract public void speak();
	abstract public void eat();
	abstract public void poop();
	
	public void hungry() {
		System.out.println("I am hungry!!!!");
	}

//	public static void hungry() {
//		System.out.println("I am hungry!!!!");
//	}
}
