package org.jfree.data.test;

import static org.junit.Assert.*;
import java.security.*;
import org.jfree.data.DataUtilities;
import org.junit.*;

public class createNumberArray2DTest {

	@BeforeClass 
	public static void setUpBeforeClass() throws Exception {
    }
	
	@Before
	public void setUp() throws Exception {
	}
	
	//Test for creating 2D array with data as NULL (invalid input)
	@Test(expected = InvalidParameterException.class)
	public void nullDataTest() {
		double[][] data = null;
		Number[][] actual = DataUtilities.createNumberArray2D(data);
		assertTrue(actual instanceof Number[][]);
		//assertEquals("Should throw Invalid Parameter Exception as data is an invalid object", expected, actual);
	}

	//Test for creating 2D array with data as 2x2 array with double values
	@Test
	public void twoByTwoArrayTest() {
		double [] [] data = {
							{1.1, 2.2},
							{3.3, 4.4}
							};
		Number [][] expected = {
							{1.1, 2.2},
							{3.3, 4.4}
							};
		Number [][] actual = DataUtilities.createNumberArray2D(data);
		boolean testResult = false;
		testResult = actual.equals(expected);
		assertEquals(true, testResult);
	}
	
	//Test to check if created array contains double values
	@Test 
	public void firstArrayShouldNotBeEmptyTest() {
		double [] [] data = {
							{1.1, 2.2},
							{3.3, 4.4}
							};
		Number [][] expected = {
							{1.1, 2.2},
							{3.3, 4.4}
							};
		Number [][] actual = DataUtilities.createNumberArray2D(data);
		assertEquals("There should be 2 double values in actual[0]", expected[0].length, actual[0].length);
	}
	
	//Test to check if created array contains double values
	@Test 
	public void secondArrayShouldNotBeEmptyTest() {
		double [] [] data = {
							{1.1, 2.2},
							{3.3, 4.4}
							};
		Number [][] expected = {
							{1.1, 2.2},
							{3.3, 4.4}
							};
		Number [][] actual = DataUtilities.createNumberArray2D(data);
		assertEquals("There should be 2 double values in actual[1]", expected[1].length, actual[1].length);
	}
	
	//Test for creating 2D array with data as 1x4 array with double values
	@Test 
	public void oneByFourArrayTest() {
		double [][] data = {{1.1, 2.2, 3.3, 4.4}};
		Number [][] expected = {{1.1, 2.2, 3.3, 4.4}};
		Number [][] actual = DataUtilities.createNumberArray2D(data);
		boolean testResult = actual.equals(expected);
		assertEquals("One by four array should pass", true, testResult);
		
	}
	
	//Test for creating 2D array with data as 4x1 array with double values
	@Test 
	public void fourByOneArrayTest() {
		double [][] data = {{1.1}, {2.2}, {3.3}, {4.4}};
		Number [][] expected = {{1.1}, {2.2}, {3.3}, {4.4}};
		Number [][] actual = DataUtilities.createNumberArray2D(data);
		boolean testResult = actual.equals(expected);
		assertEquals("Four by One array should pass", true, testResult);
		
	}
	
	//Test for creating 2D array with data as 2x2 array with negative double values
	@Test 
	public void twoByTwoArrayOfNegativeDoubles() {
		double[][] data = {
						{-1.1, -2.2},
						{-3.3, -4.4}
						};
		Number[][] expected = {
						{-1.1, -2.2},
						{-3.3, -4.4}
						};
		Number[][] actual = DataUtilities.createNumberArray2D(data);
		boolean testResult = actual.equals(expected);
		assertEquals(true, testResult);
	}
	
	@After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

}
