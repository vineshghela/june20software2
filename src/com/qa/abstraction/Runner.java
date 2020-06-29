package com.qa.abstraction;

public class Runner {

	public static void main(String[] args) {
//		Animal a = new Animal() //- cannot do this
			
	Cat c = new Cat();
	c.eat();
	c.speak();
	c.hungry();
	c.poop();
	System.out.println("__________________");
	Dog d = new Dog();
	d.speak();
	d.hungry();

//	Animal.hungry();
	}

}
