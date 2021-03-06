package com.edabit.easy;

// Add a Consecutive List of Numbers


// Write a function that takes the last number of a consecutive list of numbers and returns the total of all numbers up to 
	// and including it.

//Examples
//addUpTo(3) -> 6
//// 1 + 2 + 3 = 6
//
//addUpTo(10) -> 55
//// 1 + 2 + 3 + ... + 10 = 55
//
//addUpTo(7) -> 28
//// 1 + 2 + 3 + ... + 7 = 28



public class AddConsecutiveNumbers {
	public static int addUpTo(int n) {
		int start = 1;
		int sum = 0;
		for(int i = start; i <= n; i++){
			sum += i;
		}
		return sum;
  }
}
