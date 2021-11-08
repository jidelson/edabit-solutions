package com.edabit.easy;

public class IntegerInRange {
	public static boolean intWithinBounds(int n, int lower, int upper) {
		if(n >= lower && n < upper){
			return true;
		} else return false;
	}
	
}
