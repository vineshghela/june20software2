package com.qa.loops;

public class loops {

	public static void main(String[] args) {

//		int catCount = 0;
//		boolean notEnoughCats = true;
//
//		while (notEnoughCats) {
//			System.out.println("Another cat " + catCount);
//			catCount++;
//			if (catCount >= 10) 
//				notEnoughCats = false;
//			}
//		
//		System.out.println("Too many cats what do I do");
//		System.out.println(catCount);
//		System.out.println(notEnoughCats);
//		
		
//		int playCount = 11;
//		boolean playing = true;
//
//		do {
//		System.out.println("Playing " + playCount);
//		playCount++;
//
//		if (playCount > 10)
//			playing = false;
//
//		} while (playing);
//
//		System.out.println("Game Over!");
//		
//		int myNum = 1;
//		
//		
//		for (int i=10; i > myNum; i--){
//			System.out.println("Hello! " + i);
//		}
		
		for (int i = 0; i < 10; i++) {

			if (i == 5)
			//Breaks out of the loop
			break;
			if (i == 2)
			// Skip
			continue;

			   System.out.println(i);
			}
			System.out.println("WE are here");


	}
	

}
