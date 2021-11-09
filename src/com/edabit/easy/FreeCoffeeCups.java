package com.edabit.easy;

public class FreeCoffeeCups {
	public static int totalCups(int n) {
		int freeCups = 0;
		for(int i = 6; i <= n; i += 6){
				freeCups++;
		}
		return n + freeCups;
  }
}
