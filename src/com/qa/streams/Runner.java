package com.qa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {

	public static void main(String []args) {
		
		// array of numbers as strings.
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6","7","8","9");
		//Generate numbers from 1 to 9
		System.out.println(IntStream.range(1,10).mapToObj(String::valueOf).collect(Collectors.toList()));
//		System.out.println("Original list " + numbers);
		
		List<Integer> even = numbers.stream()
				//gets the integer value from the string
//				.map(s ->Integer.valueOf(s))
				.map(Integer::valueOf) // Another way to do the top line(line 18)
				//checking if it is even
				.filter(number -> number % 2 ==1)// Odd numbers
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
		
		// Known as a method reference 
//		forEach(System.out::println)
		 
	}
	

}
