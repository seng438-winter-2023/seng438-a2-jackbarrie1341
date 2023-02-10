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

public class GetLowerBoundTest {

	private Range sampleRange;
	
	// running tests for different sets of unique ranges
	@Test
	public void testCorrectLowerBound1() {
		sampleRange = new Range(-200.87, 200.87);
		assertEquals("The lower bound for the range (-200.87, 200.87) should be -200.87", -200.87, sampleRange.getLowerBound(), .000000001d);
	}
	
	@Test
	public void testCorrectLowerBound2() {
		sampleRange = new Range(-5.69, 20.92);
		assertEquals("The lower bound for the range (-5.69, 20.92) should be -5.69", -5.69, sampleRange.getLowerBound(), .000000001d);
	}
	
	@Test
	public void testCorrectLowerBound3() {
		sampleRange = new Range(-90.99, -3.90);
		assertEquals("The lower bound for the range (-90.99, -3.90) should be -90.99", -90.99, sampleRange.getLowerBound(), .000000001d);
	}
	
	@Test
	public void testCorrectLowerBound4() {
		sampleRange = new Range(0.00, 3.89);
		assertEquals("The lower bound for the range (0.00, 3.89) should be 0.00", 0.00, sampleRange.getLowerBound(), .000000001d);
	}

}
