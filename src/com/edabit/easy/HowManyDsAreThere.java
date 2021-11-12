package com.edabit.easy;


// How Many D's Are There?


// Create a function that counts how many D's are in a sentence.



//Examples
//countDs("My friend Dylan got distracted in school.") -> 4
//
//countDs("Debris was scattered all over the yard.")-> 3
//
//countDs("The rodents hibernated in their den.") -> 3



public class HowManyDsAreThere {
	
	static boolean isD(char ch){
		return (ch == 'D' || ch=='d');
	}

public static int countDs(String s) {
	int dCount = 0;
	for(int i = 0; i < s.length(); i++){
		if(isD(s.charAt(i))){
			dCount++;
		}
	}
	return dCount;
}

}
