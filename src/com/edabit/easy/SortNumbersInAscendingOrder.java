package com.edabit.easy;

import java.util.Arrays;

// Sort Numbers in Ascending Order


//Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
//
//Sort integer array in ascending order.
//If the function's argument is null, an empty array, or undefined; return an empty array.
//Return a new array of sorted numbers.


//Examples
//sortNumsAscending([1, 2, 10, 50, 5]) -> [1, 2, 5, 10, 50]
//
//sortNumsAscending([80, 29, 4, -95, -24, 85]) -> [-95, -24, 4, 29, 80, 85]
//
//sortNumsAscending(null) -> []
//
//sortNumsAscending([]) -> []

public class SortNumbersInAscendingOrder {

	public static int[] sortNumsAscending(int[] nums) {
		Arrays.sort(nums);
		return nums;
	}
}
