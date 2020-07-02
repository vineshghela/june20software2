package com.qa.abstraction;

public class Runner {

	public static void main(String[] args) {
//		Animal a = new Animal() //- cannot do this
			
	Cat c = new Cat();
	
	c.hungry();
	c.scratch();
//	c.eat();
//	c.speak();
//	c.hungry();
//	c.poop();
//	System.out.println("__________________");
	Dog d = new Dog();
	d.eat();
	d.hungry();
//	d.speak();
//	d.hungry();

//	Animal.hungry();
	}

}
