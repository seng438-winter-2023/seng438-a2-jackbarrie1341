package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;
import java.util.Arrays;

import junit.framework.Assert;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jfree.data.DataUtilities;
import org.jfree.data.Range;
import org.jfree.data.Values2D;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataUtilitiesTest extends DataUtilities {
	
	Mockery mockingContext = new Mockery();
	final Values2D values = mockingContext.mock(Values2D.class);
//	final Values2D values2 = mockingContext.mock(Values2D.class);
	
	@Before
    public void setUp() throws Exception {
    	
    	mockingContext.checking(new Expectations() {
		     {
		    	 //One column three rows
		         one(values).getRowCount();
		         will(returnValue(4));
		    
		         one(values).getValue(0, 0);
		         will(returnValue(7.5));
		         
		         
		         one(values).getValue(1, 0);//(row,column)
		         will(returnValue(5));
		         
		         one(values).getValue(2, 0);//(row,column)
		         will(returnValue(5));
		         
		         one(values).getValue(3, 0);//(row,column)
		         will(returnValue(2));
		     }
		 });
    	mockingContext.checking(new Expectations() {
		     {
		    	 //One column three rows
		         one(values).getColumnCount();
		         will(returnValue(3));
		         
		         
		         one(values).getValue(0, 1);
		         will(returnValue(5));
		         
//		         one(values2).getValue(0, 2);//(row,column)
//		         will(returnValue(2));
//		         
//		         one(values2).getValue(0, 3);//(row,column)
//		         will(returnValue(2.5));  
		     }
		 });
	}
	 @Test
	public void calculateColumnTotalForFourValues() {
		 
		 double result = DataUtilities.calculateColumnTotal(values, 0);
		 // verify
		 assertEquals(17.0, result, .000000001d);
		 // tear-down: NONE in this test method
	 }
	 @Test
	 public void calculateColumnTotalforInvalidInputTest() {
		 double result = DataUtilities.calculateColumnTotal(values, 0);
		 // verify
		 assertEquals(0, result, .000000001d);
	 }
	 @Test
	 public void calculateRowTotalForTwoValues() {
			 
		 double result = DataUtilities.calculateRowTotal(values, 0);
		 // verify
		 assertEquals(12.5, result, .000000001d);
	}
	 @Test
	 public void calculateRowTotalForThreeValue() {
		 
		 double result = DataUtilities.calculateRowTotal(values, 0);
		 
		 // verify
		 assertEquals(13.1, result, .000000001d);
	}
	 @Test
	 public void createNumberArrayTest() {
		 
		 double [] data = {1.0,2.0,3.0,4.0,5.0};
		 Number [] actual = DataUtilities.createNumberArray(data);
		 assertTrue("Failed to create an array of Number objects", actual instanceof Number[]);
	 }
	 @Test
	 public void createNumberArrayWithCorrectValuesTest() {
		 
		 double [] data = {1.0,2.0,3.0,4.0,5.0};
		 Number[] expected = {1.0,2.0,3.0,4.0,5.0};
		 Number [] actual = DataUtilities.createNumberArray(data);
		 
		 boolean testResult = Arrays.equals(actual, expected);
		 assertTrue("Failed to create the correct number array",testResult);
	 }
	 
	 
}
