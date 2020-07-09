package com.qa.Builder;

//public class TraineeBuilder {

public class TraineeBuilder {
	private String name = ""; // we do not want a default name.
	private int age = 0; // default age
	private String technology = "nothing"; // default technology

	public TraineeBuilder() {
	}

	public Trainee buildTrainee() {
		return new Trainee(name, age, technology);
	}

	public TraineeBuilder name(String _name) {
		this.name = _name;
		return this;
	}

	public TraineeBuilder age(int _age) {
		this.age = _age;
		return this;
	}

	public TraineeBuilder technology(String _technology) {
		this.technology = _technology;
		return this;
	}

}
