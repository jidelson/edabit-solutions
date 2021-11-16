package com.edabit.easy;

// Repeating Letters


// Create a method that takes a string and returns a string in which each character is repeated once.

//Examples
//doubleChar("String") -> "SSttrriinngg"
//
//doubleChar("Hello World!") -> "HHeelllloo  WWoorrlldd!!"
//
//doubleChar("1234!_ ") -> "11223344!!__  "
//Notes
//All test cases contain valid strings. Don't worry about spaces, special characters or numbers. They're all considered valid 
//characters.

public class RepeatingLetters {
	
    public static String doubleChar(String s) {
			String newStr = "";
      for(int i = 0; i < s.length(); i++){
				newStr += s.substring(i, i+1) + s.substring(i, i+1);
			}
			return newStr;
    }

}
