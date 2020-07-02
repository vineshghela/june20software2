package com.qa.abstraction;

public abstract class Animal {
	
	String something=null;
	
	//Empty methods
	//abstract
	
	
	
	
	
	// This one has a body { anything in here}
	public void hungry() {
		System.out.println("I am hungry for" + something);
	}
	
	public void scratch() {
		System.out.println("i scratch!!");
		System.out.println("still scratching!!");		
	}
	
	public void bankCheckBalance() {
	/*
	 * check user credentials 
	 * check that no pending transaction 
	 * if so minus from total balance
	 * show user total balance
	 * show user palance without pending.
	 * 
	 */
	}
	

}
