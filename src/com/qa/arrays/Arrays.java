package com.qa.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Arrays {
	
	
	public static void main(String[] args) {
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String name = s.nextLine();
//		System.out.println("What is your age");
//		int age = s.nextInt();
//		System.out.println("Hi " + name + ", next year you will be " + (age + 1));
//
//		
	
//	
//	int num[] = {1000,34,5};	
//	//int i=0;
////	for (int i:num) {
////		System.out.println("Number: "+i);
//	
////	System.out.println(num[1]);
//		
//	}
//	
	
//	int twoDArray[][] = {{0, 1, 2}, {8, 9, 10}, {200, 300, 400}};
//	//columns
//	for (int i = 0; i < twoDArray.length; i++) {
//	//rows
//	for (int j = 0; j < twoDArray[i].length; j++) {
//		System.out.print(twoDArray[i][j]);
//	}
//	// after each row, print a new line
//	System.out.println();
//	}


//	int twoDArray[][] = {{0, 1, 2}, {8, 9, 10}, {200, 300, 400}};
//	// columns
//	for (int[] a : twoDArray) {
//	// rows
//	for (int b : a) {
//		System.out.print(b);
//	}
//	System.out.println();
//	}
		


		
	//array lists of Strings
	//Best for searching
//	ArrayList<String> daysOfWeek = new ArrayList<String>();
//	daysOfWeek.add("Mon");
//	daysOfWeek.add("Tues");
//	daysOfWeek.add("Wed");
//	daysOfWeek.add("Thurs");
//	daysOfWeek.add("Fri");
//	daysOfWeek.add("sat");
//	daysOfWeek.add("sun");
//	
//	//System.out.println(daysOfWeek.get(0));
//	
//	
//	
//	for(int i =0; i<daysOfWeek.size();i++) {
//		System.out.println(daysOfWeek.get(i));
//	}
//	
//	daysOfWeek.remove("sun");
//	daysOfWeek.remove(1);
//	for(int i =0; i<daysOfWeek.size();i++) {
//		System.out.println(daysOfWeek.get(i));
//	}
//	
//}
	
//linked list 
// best for adding and removing items
LinkedList<String> cars = new LinkedList<String>();
cars.add("Audi");
cars.add("BMW");
cars.add("SEAT");
cars.add("honda");
cars.add("Ford");
cars.remove(0);
//	
System.out.println( cars);
System.out.println( cars);
System.out.println(cars.removeFirst());

System.out.println(cars);
	
		
	}

}
