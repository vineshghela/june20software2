package com.qa.Builder;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trainee t1 = new TraineeBuilder().name("John").buildTrainee();

		Trainee t2 = new TraineeBuilder().name("Sam").age(50).technology("Some tech").buildTrainee();

		System.out.println(t1);
	}

}
