package com.per.cannonballrange;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void testCalc() {
		RangeCalculation rc = new RangeCalculation();
		assertEquals(rc.calcLength(45),75469.0,0.0);
	}
	@Test
	public void testMaxHeight() {
		RangeCalculation rc = new RangeCalculation();
		assertEquals(rc.calcMaxHeight(90),37735.0,0.0);
	}
	@Test
	public void testMaxHeigh89Degrees() {
		RangeCalculation rc = new RangeCalculation();
		assertEquals(rc.calcMaxHeight(89),37723.0,0.0);
	}
	@Test
	public void testMaxHeigh91Degrees() {
		RangeCalculation rc = new RangeCalculation();
		assertEquals(rc.calcMaxHeight(91),37723.0,0.0);
	}
	
	@Test
	public void testMaxHeightTime() {
		RangeCalculation rc = new RangeCalculation();
		assertEquals(rc.calcMaxHeightTime(45),62.0,0.0);
	}
	
	@Test
	public void testTime() {
		RangeCalculation rc = new RangeCalculation();
		assertEquals(rc.calcTotalTime(45),124.0,0.0);
	}
}
