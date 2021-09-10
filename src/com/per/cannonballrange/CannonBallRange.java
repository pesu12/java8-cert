package com.per.cannonballrange;

import static java.lang.System.*;

import java.util.Scanner;
public class CannonBallRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeCalculation rc = new RangeCalculation();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter angle in degrees: ");
		String indata = in.nextLine();
		System.out.println("Angle is: " + indata);
		double degree = Double.parseDouble(indata);
		out.println("Length is " + (rc.calcLength(degree)) + " meters.");
		out.println("Max height is " + (rc.calcMaxHeight(degree)) + " meters.");
		out.println("Total time is " + (rc.calcTotalTime(degree)) + " meters.");
		in.close();
	}
}
