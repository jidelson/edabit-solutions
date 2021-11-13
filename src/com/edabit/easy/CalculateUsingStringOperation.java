package com.edabit.easy;

// Calculate Using String Operation


// Create a function that takes two numbers and a mathematical operator and returns the result.


//Examples
//calculate(4, 9, "+") -> 13
//
//calculate(12, 5, "-") -> 7
//
//calculate(6, 3, "*") -> 18
//
//calculate(25, 5, "/") -> 5
//
//calculate(14, 3, "%") -> 2


//Notes
//Numbers can be negative.
//The only operations used are those in the examples above.

public class CalculateUsingStringOperation {
	
	public static int calculate(int num1, int num2, String operation) {
		switch(operation){
			case "+":
				return num1 + num2;
			case "-":
				return num1 - num2;
			case "*":
				return num1 * num2;
			case "/":
				return num1 / num2;
			case "%":
				return num1 % num2;
			default:
				return 0;
		}
  }
	
	

}
