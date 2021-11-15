package com.edabit.easy;

// Find the Bomb


// Write a function that finds the word "bomb" in the given string (not case sensitive). Return "DUCK!" if found, otherwise,
// "Relax, there's no bomb.".


//Examples
//bomb("There is a bomb.") -> "DUCK!"
//
//bomb("Hey, did you think there is a BOMB?") -> "DUCK!"
//
//bomb("This goes boom!!!") -> "Relax, there's no bomb."
//Notes
//The string "bomb" may appear in different character cases (i.e. uppercase, lowercase, mixed).

public class FindTheBomb {
	public static String bomb(String str) {
		str = str.toLowerCase();
		if (str.contains("bomb")){
			return "DUCK!";
		} else return "Relax, there's no bomb.";
	}
}