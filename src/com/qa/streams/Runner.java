package com.qa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String []args) {
		
		// array of numbers as strings.
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6","7","8","9");
		System.out.println("Original list " + numbers);
		
		List<Integer> even = numbers.stream()
				//gets the integer value from the string
				.map(s ->Integer.valueOf(s))
				//checking if it is even
				.filter(number -> number % 2 ==1)// odd numbers
//				.filter(number -> number % 2 ==0)// Even numbers
				//Collects results in to list call even.
				.collect(Collectors.toList());
		
		System.out.println(even);

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "", "");
		System.out.println(strings);
		
		List<String> filtered = strings.stream()
				// checking each item and we check it is empty
				.filter(s-> !s.isEmpty())
//				.filter(s-> s.isEmpty())
				// add the remaining element to the list
				.collect(Collectors.toList());
		System.out.println(filtered);
		 
	}
	

}
