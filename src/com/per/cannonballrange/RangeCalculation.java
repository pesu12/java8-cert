package com.per.cannonballrange;

import static java.lang.Math.*;
class RangeCalculation{

	final int INIT_SPEED = 860;
	final double G = 9.8;
	
	public Double calcLength(double degrees){	
		double result = (2*(INIT_SPEED*INIT_SPEED)*sin(toRadians(degrees))*cos(toRadians(degrees)))/(G);
		return  (double) round(result);
	}
	
	public Double calcMaxHeight(double degrees){	
		double result = ((INIT_SPEED*INIT_SPEED)*(sin(toRadians(degrees))*sin(toRadians(degrees))))/(2*G);
		return  (double) round(result);
	}
	
	public Double calcMaxHeightTime(double degrees){	
		double result = ((INIT_SPEED)*sin(toRadians(degrees)))/(G);
		return  (double) round(result);
	}
	
	public Double calcTotalTime(double degrees){	
		double result = 2*calcMaxHeightTime(degrees);
		return  (double) round(result);
	}
}
