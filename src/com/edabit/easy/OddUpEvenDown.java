package com.edabit.easy;

// Odd Up, Even Down


// Create a function that goes through the array, incrementing (+1) for each odd-valued number and decrementing (-1) for each 
// even-valued number.


//Examples
//transform([1, 2, 3, 4, 5]) -> [2, 1, 4, 3, 6]
//
//transform([3, 3, 4, 3]) -> [4, 4, 3, 4]
//
//transform([2, 2, 0, 8, 10]) -> [1, 1, -1, 7, 9]
		
		
public class OddUpEvenDown {
	
	public static int[] transform(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				arr[i]--;
			} else arr[i]++;
		}
		return arr;
	}

}
