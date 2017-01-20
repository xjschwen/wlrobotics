package org.wlrobotics;

import org.wlrobotics.GyroHelper;
import org.wlrobotics.Tester;

public class GyroHelperTester {

	public boolean run(){
		boolean retValue = true;
		Tester tester = new Tester();
		GyroHelper gh = new GyroHelper();
		
		retValue = retValue && tester.doubles(gh.normalizeHeading(0.0), 0.0, "gh.normalizeHeading(0.0)");
		retValue = retValue && tester.doubles(gh.normalizeHeading(1.0), 1.0, "gh.normalizeHeading(1.0)");
		retValue = retValue && tester.doubles(gh.normalizeHeading(-0.0), -0.0, "gh.normalizeHeading(-0.0)");
		//retValue = retValue && tester.doubles(gh.normalizeHeading(360.0), 0.0, "gh.normalizeHeading(360.0)");
		
		
		return retValue;
		
		
	}
	
	
	
	
		
}
