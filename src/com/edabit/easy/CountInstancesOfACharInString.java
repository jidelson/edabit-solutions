package com.edabit.easy;

// Count Instances of a Character in a String

//Create a function that takes a character and a string as arguments and returns the number of times the character is found in 
//the string.
//
//Examples
//charCount('a', "edabit") -> 1
//
//charCount('c', "Chamber of secrets") -> 1
//
//charCount('b', "big fat bubble") -> 4


public class CountInstancesOfACharInString {
	
	public static int charCount(char c, String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == c){
				count++;
			}
		}
		return count;
	}
	
}
