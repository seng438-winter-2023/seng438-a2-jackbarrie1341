package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeContainsTest {
	private Range exampleRange;
	 
	@Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-10.23, 25.02);
    }
	
	
	/**
	 * Tests the contains method where the input is just below the lower bound of the range,
	 * which should return false
	 */
	@Test
	public void inputBelowLowerBoundShouldBeFalse() {
		assertFalse("The value -10.24 should not be within (-10.23, 25.02)", exampleRange.contains(-10.24));
	}
	
	/**
	 * Tests the contains method where the input is the lower bound of the range,
	 * which should return true
	 */
	@Test
	public void inputAtLowerBoundShouldBeTrue() {
		assertTrue("The value -10.23 should be within (-10.23, 25.02)", exampleRange.contains(-10.23));
	}
	
	/**
	 * Tests the contains method where the input is just above the lower bound of the range,
	 * which should return true
	 */
	@Test
	public void inputAboveLowerBoundShouldBeTrue() {
		assertTrue("The value -10.22 should be within (-10.23, 25.02)", exampleRange.contains(-10.22));
	}
	
	/**
	 * Tests the contains method where the input is a nominal value in the range,
	 * which should return true
	 */
	@Test
	public void inputOfNominalValueShouldBeTrue() {
		assertTrue("The value 0.06 should be within (-10.23, 25.02)", exampleRange.contains(0.06));
	}
	
	/**
	 * Tests the contains method where the input is just below the upper bound of the range,
	 * which should return true
	 */
	@Test
	public void inputBelowUpperBoundShouldBeTrue() {
		assertTrue("The value 25.01 should be within (-10.23, 25.02)", exampleRange.contains(25.01));
	}
	
	/**
	 * Tests the contains method where the input is the upper bound of the range,
	 * which should return true
	 */
	@Test
	public void inputAtUpperBoundShouldBeTrue() {
		assertTrue("The value 25.02 should be within (-10.23, 25.02)", exampleRange.contains(25.02));
	}
	
	/**
	 * Tests the contains method where the input is just above the upper bound of the range,
	 * which should return false
	 */
	@Test
	public void inputAboveUpperBoundShouldBeFalse() {
		assertFalse("The value 25.03 should not be within (-10.23, 25.02)", exampleRange.contains(25.03));
	}
	
}
