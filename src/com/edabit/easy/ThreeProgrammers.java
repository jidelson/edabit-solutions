package com.edabit.easy;

// The 3 Programmers Problem


// You hired three programmers and you (hopefully) pay them. Create a function that takes three numbers (the hourly wages of each 
//programmer) and returns the difference between the highest-paid programmer and the lowest-paid.


//Examples
//programmers(147, 33, 526) -> 493
//
//programmers(33, 72, 74) -> 41
//
//programmers(1, 5, 9) -> 8


public class ThreeProgrammers {
	public static int programmers(int one, int two, int three) {

		int min, max;
		
		min = Math.min(Math.min(one,two), three);
		max = Math.max(Math.max(one,two), three);
		
		return max - min;
  }
}
