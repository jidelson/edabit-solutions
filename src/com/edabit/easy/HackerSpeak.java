package com.edabit.easy;

// H4ck3r Sp34k


// Create a function that takes a string as an argument and returns a coded (h4ck3r 5p34k) version of the string.

//Examples
//hackerSpeak("javascript is cool") -> "j4v45cr1pt 15 c00l"
//
//hackerSpeak("programming is fun") -> "pr0gr4mm1ng 15 fun"
//
//hackerSpeak("become a coder") -> "b3c0m3 4 c0d3r"
//Notes
//In order to work properly, the function should replace all "a"s with 4, "e"s with 3, "i"s with 1, "o"s with 0, and "s"s with 5.

public class HackerSpeak {
	
	public static String hackerSpeak(String str) {
		String newStr = str.replace('a','4')
			.replace('e', '3')
			.replace('i', '1')
			.replace('o', '0')
			.replace('s', '5');
		
		return newStr;
	}

}
