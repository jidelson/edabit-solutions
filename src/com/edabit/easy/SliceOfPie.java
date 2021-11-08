package com.edabit.easy;

public class SliceOfPie {
	public static boolean equalSlices(int total, int people, int each) {
		if(people == 0){
			return true;
		} else if(people * each <= total){
			return true;
		} else return false;
	}
}
