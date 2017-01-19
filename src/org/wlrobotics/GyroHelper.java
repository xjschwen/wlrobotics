package org.wlrobotics;

public class GyroHelper {

	
	public double normalizeHeading(double heading){
	   
		double nh = heading;
		
		
		if (heading >0 && heading < 180)
			nh = heading;

		return (nh);
	}
	
}
