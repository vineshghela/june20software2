package com.qa.Builder;

public class Trainee {

	private String name = ""; // we do not want a default name.
	private int age = 0; // default age
	private String technology = "nothing"; // default technology

	public Trainee(String name, int age, String technology) {
		this.age = age;
		this.name = name;
		this.technology = technology;
	}

}
