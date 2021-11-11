package com.edabit.easy;

///Capture the Rook


//Write a function that returns true if two rooks can attack each other, and false otherwise.


//canCapture(["A8", "E8"]) -> true
//
//canCapture(["A1", "B2"]) -> false
//
//canCapture(["H4", "H3"]) -> true
//
//canCapture(["F5", "C8"]) -> false

//Notes
//Assume no blocking pieces.
//Two rooks can attack each other if they share the same row (letter) or column (number).

public class CaptureTheRook {
	public static boolean canCapture(String[] rooks) {
		if(rooks[0].substring(0,1).equals(rooks[1].substring(0,1)) || 
			rooks[0].substring(1,2).equals(rooks[1].substring(1,2))
			){
			return true;
		} else return false;
	}
}
