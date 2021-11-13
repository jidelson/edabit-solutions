package com.edabit.easy;

// Maximum Difference


// Given an array of integers, return the difference between the largest and smallest integers in the array.


//Examples
//difference([10, 15, 20, 2, 10, 6]) -> 18
//# 20 - 2 = 18
//
//difference([-3, 4, -9, -1, -2, 15]) -> 24
//# 15 - (-9) = 24
//
//difference([4, 17, 12, 2, 10, 2]) -> 15

public class MaximumDifference {
	
	public static int difference(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > max){
				max = nums[i];
			} else if(nums[i] < min){
				min = nums[i];
			}
		}
		return max - min;
	}

}
