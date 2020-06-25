package com.qa.stringMethods;

public class Strings {
	public static void main(String[]agrs) {
		
				String str1 = "MyText";
				
				System.out.println(str1.length()); 
				System.out.println(str1.toLowerCase());
				System.out.println(str1.charAt(3)); 
				System.out.println(str1.indexOf("e"));
				System.out.println(str1.endsWith("t"));
				System.out.println(str1.contains("Xt"));
				System.out.println(str1.toUpperCase());
				//Things to remember 
				//Start index is inclusive
				//Endindex is exclusive
				System.out.println(str1.substring(1,3));



	}

}
