package com.edabit.easy;

public class AddSubtractMultiplyDivide {
	public static String operation(int num1, int num2) {
		if(num1 + num2 == 24){
			return "added";
		} else if(num1 - num2 == 24){
			return "subtracted";
		} else if(num1 / num2 == 24){
			return "divided";
		} else if (num1 * num2 == 24){
			return "multiplied";
		} else return "none";
	}
}
