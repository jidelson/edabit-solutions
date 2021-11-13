package com.edabit.easy;


// Convert Number to Corresponding Month Name


// Create a function that takes a number (from 1 to 12) and returns its corresponding month name as a string. For example, if 
// you're given 3 as input, your function should return "March", because March is the 3rd month.



//Number	Month Name
//1	January
//2	February
//3	March
//4	April
//5	May
//6	June
//7	July
//8	August
//9	September
//10	October
//11	November
//12	December


//Examples
//monthName(3) -> "March"
//
//monthName(12) -> "December"
//
//monthName(6) -> "June"


public class ConvertNumberToCorrespondingMonthName {
	
	public static String monthName(int num) {
		if(num == 1){
			return "January";
		} else if (num == 2){
			return "February";
		} else if (num == 3){
			return "March";
		} else if(num == 4){
			return "April";
		} else if(num == 5){
			return "May";
		} else if (num == 6){
			return "June";
		} else if (num == 7){
			return "July";
		} else if(num == 8){
			return "August";
		} else if(num == 9){
			return "September";
		} else if(num == 10){
			return "October";
		} else if(num == 11){
			return "November";
		} else if(num == 12){
			return "December";
		}
	return "Not a valid month";
	}

}
