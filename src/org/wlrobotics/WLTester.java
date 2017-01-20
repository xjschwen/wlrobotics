package org.wlrobotics;

import org.wlrobotics.GyroHelperTester;

public class WLTester {

	public static void main(String[] args) {
		
		boolean retValue = true;
		GyroHelperTester ght = new GyroHelperTester();
		retValue = retValue && ght.run();
		
		if (retValue){
			System.exit(0);
		}
		else{
			System.exit(1);
		}
	}
}
