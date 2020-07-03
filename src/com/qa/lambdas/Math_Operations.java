package com.qa.lambdas;

public class Math_Operations implements MAths {
	
	//with type declaration
    MathOperation addition = ( int a, int b) -> a + b;
		
    //with out type declaration
    MathOperation subtraction = (a, b) -> a - b;
		
    //with return statement along with curly braces
    MathOperation multiplication = (int a, int b) -> { return a * b; };
		
    //without return statement and without curly braces
    MathOperation division = (int a, int b) -> a / b;

    
    public int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
}
