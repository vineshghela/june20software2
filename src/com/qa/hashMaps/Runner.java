package com.qa.hashMaps;

import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {

		// Create a HashMap object called capitalCities
		HashMap<Integer, String> capitalCities = new HashMap<Integer, String>();

		// Add keys and values (Country, City)
		capitalCities.put(1, "Aaris");
		capitalCities.put(2, "London");
		capitalCities.put(3, "Berlin");
//		capitalCities.put("Norway", "Oslo");
//		capitalCities.put("USA", "Washington DC");
//		capitalCities.put("London", "West London");
		System.out.println(capitalCities);
		System.out.println(capitalCities.get(1));

//		System.out.println(capitalCities.get("London"));
//
//		capitalCities.remove("England");
//		System.out.println(capitalCities);
//
//		capitalCities.clear();
//		System.out.println(capitalCities);
//		System.out.println(capitalCities.size());
//
//		for (String i : capitalCities.keySet()) {
//			System.out.println(i);
//		}
//
//		// Print keys and values
//		for (String i : capitalCities.keySet()) {
//			System.out.println("key: " + i + " value: " + capitalCities.get(i));
//		}
	}

}
