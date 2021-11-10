package com.edabit.easy;

//To the Power of _____

// Create a function that takes a base number and an exponent number and returns the calculation.

//Examples
//calculateExponent(5, 5) -> 3125
//
//calculateExponent(10, 10) -> 10000000000
//
//calculateExponent(3, 3) -> 27

public class ToThePowerOf {

	public static int calculateExponent(int num, int exp) {
		return (int)Math.pow(num,exp);
	}
}
