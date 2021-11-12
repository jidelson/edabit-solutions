package com.edabit.easy;

// How Many Vowels?


//Create a function that takes a string and returns the number (count) of vowels contained within it.


//Examples
//countVowels("Celebration") -> 5
//
//countVowels("Palm") -> 1
//
//countVowels("Prediction") -> 4
//Notes
//a, e, i, o, u are considered vowels (not y).
//All test cases are one word and only contain letters.

public class HowManyVowels {
	
	static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                           ch=='O' || ch=='U');
    }
	
  public static int getCount(String str) {
    int vowelsCount = 0;
    for(int i = 0; i < str.length(); i++){
			if(isVowel(str.charAt(i)))
			{vowelsCount++;}
		}
    return vowelsCount;
  }

}
