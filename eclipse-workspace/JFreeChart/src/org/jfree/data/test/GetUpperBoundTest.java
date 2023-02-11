package org.jfree.data.test;

import org.jfree.data.Range;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Test;

public class GetUpperBoundTest {

	private Range sampleRange;
	
	// running tests for different sets of unique ranges
	@Test
	public void testCorrectUpperBound1() {
		sampleRange = new Range(-200.87, 200.87);
		assertEquals("The upper bound for the range (-200.87, 200.87) should be 200.87", 200.87, sampleRange.getUpperBound(), .000000001d);
	}
	
	@Test
	public void testCorrectUpperBound2() {
		sampleRange = new Range(-5.69, 20.92);
		assertEquals("The upper bound for the range (-5.69, 20.92) should be 20.92", 20.92, sampleRange.getUpperBound(), .000000001d);
	}
	
	@Test
	public void testCorrectUpperBound3() {
		sampleRange = new Range(-90.99, -3.90);
		assertEquals("The upper bound for the range (-90.99, -3.90) should be -3.90", -3.90, sampleRange.getUpperBound(), .000000001d);
	}
	
	@Test
	public void testCorrectUpperBound4() {
		sampleRange = new Range(0.00, 3.89);
		assertEquals("The upper bound for the range (0.00, 3.89) should be 3.89", 3.89, sampleRange.getUpperBound(), .000000001d);
	}

}
