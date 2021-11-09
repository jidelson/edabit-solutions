package com.edabit.easy;

public class InvertColors {
	public static int[] invertColor(int[] rgb) {
		for(int i = 0; i < rgb.length; i++){
			 rgb[i] =  255 - rgb[i];
		}
		return rgb;
	}
}
