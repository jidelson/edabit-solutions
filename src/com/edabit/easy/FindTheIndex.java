package com.edabit.easy;

import java.util.*;


// Find the Index

//Create a function that takes an array and a string as arguments and return the index of the string.
//
//Examples
//findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh") -> 2
//
//findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue") -> 1
//
//findIndex(new String[]{"a", "g", "y", "d"}, "d") -> 3
//
//findIndex(new String[]{"Pineapple", "Orange", "Grape", "Apple"}, "Pineapple") -> 0

public class FindTheIndex {
	
	public static int findIndex(String[] arr,String str) {
		return Arrays.asList(arr).indexOf(str);
		
	}

}
