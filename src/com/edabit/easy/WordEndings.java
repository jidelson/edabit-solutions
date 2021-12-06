package com.edabit.easy;

// Word Endings

//Create a function that adds a string ending to each member in an array.
//
//Examples
//addEnding(["clever", "meek", "hurried", "nice"], "ly")
//-> ["cleverly", "meekly", "hurriedly", "nicely"]
//
//addEnding(["new", "pander", "scoop"], "er")
//-> ["newer", "panderer", "scooper"]
//
//addEnding(["bend", "sharpen", "mean"], "ing")
//-> ["bending", "sharpening", "meaning"]

public class WordEndings {
	
	public static String[] addEnding(String[] arr, String ending) {
		String[] output = arr.clone();
		
		for(int i = 0; i < arr.length; i++){
			output[i] = arr[i] + ending;
		}
		return output;
	}

}
