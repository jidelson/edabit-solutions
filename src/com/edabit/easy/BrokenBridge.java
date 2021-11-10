package com.edabit.easy;

//Create a function which validates whether a bridge is safe to walk on (i.e. has no gaps in it to fall through).

//Examples
//isSafeBridge("####") == true
//
//isSafeBridge("## ####") == false

// Notes
//You can expect the bridge's ends are connected to its surrounding.


public class BrokenBridge {
	
	public static boolean isSafeBridge(String bridge) {
		if(bridge.contains(" ")){
			return false;
		} else return true;
	}

}
