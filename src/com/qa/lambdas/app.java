package com.qa.lambdas;

public class app {

	public static void main(String[] args) {
		
		 
		Math_Operations maths = new Math_Operations();
	      
			
	      System.out.println(maths.operate(10, 5, maths.addition));
	      System.out.println(maths.operate(10, 5, maths.subtraction));
	      System.out.println("10 x 5 = " + maths.operate(10, 5, maths.multiplication));
	      System.out.println("10 / 5 = " + maths.operate(10, 5, maths.division));
//			
	      //without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Vin");
	      greetService2.sayMessage("Alan");
	      
//	      
	      Ball ball = () -> { System.out.println("You hit ball"); };
		  ball.hit();
	   }
	
		interface GreetingService {
	      void sayMessage(String message);
	   }
		
		interface Ball{void hit();}
		
		
//	   interface MathOperation {
//	      int operation(int a, int b);
//	   }  
	  
	   
	   
	}

