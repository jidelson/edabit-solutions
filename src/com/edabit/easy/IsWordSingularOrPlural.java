package com.edabit.easy;

public class IsWordSingularOrPlural {
	public static boolean isPlural(String word) {
		if(word.endsWith("s")){
			return true;
		} else return false;
	}
}
