package com.lacey.engsoftware;

public class LaceyBuzzFizz {

	static String FIZZ = "Fizz";
	static String BUZZ = "Buzz";

	public static void main(String args[]) {
		
		for (int i = 1; i < 100; i++) {
			
			// If number is divisible by 3 and 5 we print FIZZBUZZ
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(FIZZ + BUZZ);
			}
			// If number is divisible by 3 we print FIZZ
			else if (i % 3 == 0) {
				System.out.println(FIZZ);
			} 
			// If number is divisible by 5 we print BUZZ
			else if (i % 5 == 0) {
				System.out.println(BUZZ);
			}
			else{
				System.out.println(i);
			}
		}
	}
}