package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeConstrainTest {
    private Range exampleRange;
    private Range exampleSingleValueRange;
    @Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-10.23, 25.02);
    	exampleSingleValueRange = new Range(-20.5, -20.5);
    }
    
    
    /**
     * Tests the the constrain method where the input value is just below the range, which should 
     * return the lower bound of the range.
     */
    @Test
    public void inputBelowLowerBoundShouldReturnLowerBound( ) {
    	assertEquals("The value within the range (-10.23, 25.02) that is closest to -10.25 should be -10.23", -10.23, 
    			exampleRange.constrain(-10.25), .000000001d);
    }
    
    /**
     * Tests the constrain method where the input value is the lower bound, which should return 
     * the lower bound of the range
     */
    @Test
    public void inputOfLowerBoundShouldReturnLowerBound() {
    	assertEquals("The value within the range (-10.23, 25.02) that is closest to -10.23 should be -10.23", -10.23, 
    			exampleRange.constrain(-10.23), .000000001d);
    }
    
    /**
     * Tests the constrain method where the input value is just above the lower bound, which should
     * return the input value
     */
    @Test
    public void inputAboveLowerBoundShouldReturnInputValue() {
    	assertEquals("The value within the range (-10.23, 25.02) that is closest to -10.20 should be -10.20", -10.20, 
    			exampleRange.constrain(-10.20), .000000001d);
    }
    
    /**
     * Tests the constrain method where the input value is a nominal value, which should
     * return the input value
     */
    @Test
    public void inputOfNominalValueShouldReturnInputValue() {
    	assertEquals("The value within the range (-10.23, 25.02) that is closest to 0.05 should be 0.05", 0.05, 
    			exampleRange.constrain(0.05), .000000001d);
    }
    
    /**
     * Tests the constrain method where the input value is just below the upper bound, which should
     * return the input value
     */
    @Test
    public void inputBelowUpperBoundShouldReturnInputValue() {
    	assertEquals("The value within the range (-10.23, 25.02) that is closest to 25.01 should be 25.01", 25.01, 
    			exampleRange.constrain(25.01), .000000001d);
    }
    
    /**
     * Tests the constrain method where the input value is the upper bound, which should
     * return the upper bound of the range
     */
    @Test
    public void inputAtUpperBoundShouldReturnUpperBound() {
    	assertEquals("The value within the range (-10.23, 25.02) that is closest to 25.02 should be 25.02", 25.02, 
    			exampleRange.constrain(25.02), .000000001d);
    }
    
    /**
     * Tests the constrain method where the input value is just above the upper bound, which should
     * return the upper bound of the range
     */
    @Test
    public void inputAboveUpperBoundShouldReturnUpperBound() {
    	assertEquals("The value within the range (-10.23, 25.02) that is closest to 25.03 should be 25.02", 25.02, 
    			exampleRange.constrain(25.03), .000000001d);
    }
    
    /**
     * Tests the constrain method where the upper and lower bounds of the range are equal, with an input
     * just below the range, which should return the value of the range
     */
    @Test
    public void inputBelowSingleValueRangeShouldEqualRange() {
    	assertEquals("The value within the range (-20.5, -20.5) that is closest to -21.1 should be -20.5", -20.5, 
    			exampleSingleValueRange.constrain(-21.1), .000000001d);
    }
    
    /**
     * Tests the constrain method where the upper and lower bounds of the range are equal, with an input
     * equal to the range, which should return the value of the range
     */
    @Test
    public void inputEqualsSingleValueRangeShouldEqualRange() {
    	assertEquals("The value within the range (-20.5, -20.5) that is closest to -20.5 should be -20.5", -20.5, 
    			exampleSingleValueRange.constrain(-20.5), .000000001d);
    }
    
    /**
     * Tests the constrain method where the upper and lower bounds of the range are equal, with an input
     * above the range, which should return the value of the range
     */
    @Test
    public void inputAboveSingleValueRangeShouldEqualRange() {
    	assertEquals("The value within the range (-20.5, -20.5) that is closest to -19.9 should be -20.5", -20.5, 
    			exampleSingleValueRange.constrain(-19.9), .000000001d);
    }
    
}
