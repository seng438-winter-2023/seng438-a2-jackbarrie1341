package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Test;

public class RangeGetLengthTest {
	
	private Range exampleRange;
	
	/**
	 * Tests getLength method where the ranges lower and upper bounds are negative
	 */
	@Test
	public void testNegativeUpperAndLowerBounds() {
		exampleRange = new Range(-100.01, -34.23);
		assertEquals("The length of the range (-100.01, -34.23) should be 65.78", 65.78, 
				exampleRange.getLength(), .000000001d);
	}
	
	/**
	 * Tests getLength method where the ranges lower bound is negative and the upper bound is positive
	 */
	@Test
	public void testNegativeLowerBoundPositiveUpperBound() {
		exampleRange = new Range(-100.01, 15.1);
		assertEquals("The length of the range (-100.01, 15.1) should be 115.11", 115.11, 
				exampleRange.getLength(), .000000001d);
	}
	
	/**
	 * Tests getLength method where the ranges lower and upper bounds are positive
	 */
	@Test
	public void testPositiveUpperBoundAndLowerBounds() {
		exampleRange = new Range(10.01, 15.1);
		assertEquals("The length of the range (10.01, 15.1) should be 5.09", 5.09, 
				exampleRange.getLength(), .000000001d);
	}
	
	/**
	 * Tests getLength method where the ranges lower and upper bounds are equal
	 */
	@Test
	public void testUpperBoundEqualsLowerBound() {
		exampleRange = new Range(1, 1);
		assertEquals("The length of the range (1, 1) should be 0", 0, 
				exampleRange.getLength(), .000000001d);
	}

}
