package com.edabit.easy;

// Remove the First and Last Characters


// Create a function that removes the first and last characters from a string.

//Examples
//removeFirstLast("hello") -> "ell"
//
//removeFirstLast("maybe") -> "ayb"
//
//removeFirstLast("benefit") -> "enefi"
//
//removeFirstLast("a") -> "a"
//Notes
//If the string is 2 or fewer characters long, return the string itself (See example #4).

public class RemoveFirstAndLastCharacters {
	
	public static String removeFirstLast(String str) {
		if(str.length() <= 2){
			return str;
		}
		str = str.substring(1, str.length() - 1);
		return str;
	}

}
