package org.wlrobotics;

public class Tester {

	
	public boolean doubles( double testValue, double expected, String message){
		boolean retValue = false;
		if (testValue == expected) {
			System.out.println("PASS: " + message);
			retValue = true;
		}
		else{
			System.out.println("FAIL: " + message + " " + "expected = " + expected + " received = " + testValue);
		}
		return retValue;
	}
	
}
