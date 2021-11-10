package com.edabit.easy;

// Nth Star Number


// Create a method that takes a positive integer n and returns the nth "star number".
// A star number is a centered figurate number that represents a centered hexagram (six-pointed star), such as the one that Chinese checkers is played on.


//Examples
//starNumber(2)  -> 13
//// n = 2
//// 2nd star number = 13
//
//starNumber(3) -> 37
//// n = 3
//// 3rd star number = 37
//
//starNumber(5) -> 121
//// n = 5
//// 5th star number = 121


// Notes
//n will always be a positive integer.
//The nth term of a star number can be represented as 6n(n-1) + 1


public class NthStarNumber {
	 public static int starNumber(int n) {
			return (6*n) * (n-1) + 1;
	  }
}
