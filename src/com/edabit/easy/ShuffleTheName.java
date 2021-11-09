package com.edabit.easy;

public class ShuffleTheName {
	 public static String nameShuffle(String s) {
	      String fName = s.substring(0, s.indexOf(" "));
				String lName = s.substring(s.indexOf(" "));
				String fullName = lName + fName;
				
				return fullName;
				
				
	    }
}
