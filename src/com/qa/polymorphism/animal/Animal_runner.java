package com.qa.polymorphism.animal;

public class Animal_runner {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		
//		Animal a2 = new Animal("Milo", 7);
//		System.out.println(a2.run());
		
		Animal a3 = new Animal(16);
		
		System.out.println(a3.run());
		System.out.println(a3.run(45));
		System.out.println(a3.getName());
		System.out.println(a3.getAge());
		System.out.println(a3.getSpeed());

	}

}
