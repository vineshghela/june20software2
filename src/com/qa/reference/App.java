package com.qa.reference;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Charlie");
		Person p2 = new Person("Dana");

		char c = 77;
		int i = 'D';
		
		System.out.println(c);
		System.out.println(i);
		System.out.println( ""+'f' +  'g'+ 27+'h');
		
		System.out.println("Vin" == "Vin");
		//^ check it exists - not consistent 50/50 chance - same memory location in the pool
		System.out.println(new String ("Vin") == "Vin");
		//false
		//Brand new object
		// use .equals
		
		System.out.println(new String ("Vin").equals("Vin"));
		
		System.out.println("Before swap - P1: " + p1.name + ", P2: " + p2.name);
		swap2(p1, p2);
		System.out.println("After swap - P1: " + p1.name + ", P2: " + p2.name);
	}

	//Does not work 
	public static void swap(Person person1, Person person2) {
		// New temp variable.
		Person temp = new Person("");
		// temp = to person1
		temp = person1;
		person1 = person2;
		person2 = temp;
	}
	//This one works @jHarry
	public static void swap2(Person person1, Person person2) {
		String name = person1.name;
		person1.name = person2.name;
		person2.name = name;
		
	}
	

}
