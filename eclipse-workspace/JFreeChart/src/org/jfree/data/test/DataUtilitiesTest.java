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
		    	 //One row three columns
		         one(values).getRowCount();
		         will(returnValue(4));
		         one(values).getColumnCount();
		         will(returnValue(3));
		    
		         one(values).getValue(0, 0);
		         will(returnValue(7.5));
		         
		         one(values).getValue(0, 1);
		         will(returnValue(5));
		         
		         
		         one(values).getValue(1, 0);//(row,column)
		         will(returnValue(5));
		         
		         one(values).getValue(2, 0);//(row,column)
		         will(returnValue(5));
		         
		         one(values).getValue(3, 0);//(row,column)
		         will(returnValue(2));
		         
		         one(values).getValue(1, 1);
		         will(returnValue(5));
		         
		         one(values).getValue(2, 1);
		         will(returnValue(5));
		         
		         one(values).getValue(3, 1);
		         will(returnValue(5));

		         one(values).getValue(1, 2);//(row,column)
		         will(returnValue(2));
		         
		         
		     }
		 });
	}
	
	 @Test
	public void calculateColumnTotalForFourValuesTest() {
		 
		 double result = DataUtilities.calculateColumnTotal(values, 0);
		 // verify
		 assertEquals(19.5, result, .000000001d);
		 // tear-down: NONE in this test method
	 }
	
	 @Test
	 public void calculateRowTotalForTwoValuesTest() {
			 
		 double result = DataUtilities.calculateRowTotal(values, 2);
		 // verify
		 assertEquals(10.0, result, .000000001d);
	}
	 @Test
	 public void calculateRowTotalForThreeValuesTest() {
		 
		 double result = DataUtilities.calculateRowTotal(values, 1);
		 
		 // verify
		 assertEquals(12.0, result, .000000001d);
	}
	 //Test to determine if the array of object created is of type Number[]
	 @Test
	 public void createNumberArrayTest() {
		 
		 double [] data = {1.0,2.0,3.0,4.0,5.0};
		 Number [] actual = DataUtilities.createNumberArray(data);
		 assertTrue("Failed to create an array of Number objects", actual instanceof Number[]);
	 }
	 
	 /*Nominal input value tested to see if the correct Number array is created*/
	 @Test
	 public void createNumberArrayWithCorrectValuesTest() {
		 
		 double [] data = {1.0,2.0,3.0,4.0,5.0};
		 Number[] expected = {1.0,2.0,3.0,4.0,5.0};
		 Number [] actual = DataUtilities.createNumberArray(data);
		 
		 
		 assertArrayEquals("Failed to create the correct number array",expected,actual);
	 }
	 
	 /* Boundary Value Test to check if the Number array is
	  * created when the input is the min possible double
	 */
		@Test
		public void createNumberArrayMinInputTest() 
		{
			Double[] expected = {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE};
			double[] data = {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE};
			Number [] actual = DataUtilities.createNumberArray(data);
			assertArrayEquals("Failed to create correct number Array",expected, actual);
		}
	 /* Boundary Value Test to check if the Number array is
	  * created when the input is the max possible double
	 */
		@Test
		public void createNumberArrayMaxInputTest() 
		{
			Double[] expected = {Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE};
			double[] data = {Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE};
			Number [] actual = DataUtilities.createNumberArray(data);
			assertArrayEquals("Failed to create correct number Array", expected, actual);
		}
	 
}
