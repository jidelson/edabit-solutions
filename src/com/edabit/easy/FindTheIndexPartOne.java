package com.edabit.easy;

//Find the Index (Part 1)

//Create a function that finds the index of a given item.
//
//Examples
//search([1, 5, 3], 5) -> 1
//
//search([9, 8, 3], 3) -> 2
//
//search([1, 2, 3], 4) -> -1
//Notes
//If the item is not present, return -1.

public class FindTheIndexPartOne {
	
	public static int search(int[] arr, int item) {
		for(int i = 0; i < arr.length; i++){
			if(item == arr[i]){
				return i;
			}
		} return -1;
  }

}
