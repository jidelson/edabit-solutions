package com.edabit.easy;

// Return the Factorial


// Create a function that takes an integer and returns the factorial of that integer. That is, the integer multiplied by all 
// positive lower integers.


//Examples
//factorial(3) -> 6
//
//factorial(5) -> 120
//
//factorial(12) -> 479001600
//Notes
//Assume all inputs are greater than or equal to 0.


public class ReturnTheFactorial {

	public static int factorial(int num) {
		 if (num <= 2) {
       return num;
   }
   return num * factorial(num - 1);
	}
	
}
