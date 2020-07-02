package com.qa.scanners;

import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		// scanners
		// simple scanner to take a number between 1-12
		Scanner s = new Scanner(System.in);
		
		
		// variable 
		int month = 0;
		int count=0;
		//do while 
		System.out.println("Enter a Number");
		do {
			if(count !=0) {
				System.out.println("Enter a number between 1 & 12");
			}
			count=1;
			
			//! means not
			// != 
			//check input and make sure its a number
			while(!s.hasNextInt()){
				System.out.println("Enter a valid number between 1-12");
				s.next();	
			}
			// Read input from that line.
			month = s.nextInt();
		}while (month <= 0 || month >=13);
		System.out.println("You entered:"+month);
		
		
		
		
		
		switch(month) {
		
		case 1: 
			System.out.println("You have chosen cusomer");
			System.out.println("Select 1 to Create customer db");
			System.out.println("Select 2 to read customer db");
			System.out.println("Select 3 to update customer db");
			System.out.println("Select 3 to delete customer db");
			System.out.println("Enter a Number");
			
			whatToDo(month);
			break;
		case 2 :
			System.out.println("order");
			break;
		case 3 :
			System.out.println("Products");
			break;
		}
		
	}
	
	public static void whatToDo(int myNumber) {
		switch(myNumber) {
		case 1:
			System.out.println("Create");
			break;
		case 2:
			System.out.println("Read");
			break;
		case 3:
			System.out.println("Update");
			break;
		case 4:
			System.out.println("Delete");
			break;
		
		}
	}
	
	public static void doWhileCheck5() {
		Scanner sc = new Scanner(System.in);
		int option=0;
		int count=0;
		do {
			if(count !=0) {
				System.out.println("Enter a number between 1 & 12");
			}
			count=1;
			while(!sc.hasNextInt()){
				System.out.println("Enter a valid number between 1-12");
				sc.next();	
			}
			option = sc.nextInt();
		}while(option <= 0 || option >=5);
		
	}
	
	
	
}
