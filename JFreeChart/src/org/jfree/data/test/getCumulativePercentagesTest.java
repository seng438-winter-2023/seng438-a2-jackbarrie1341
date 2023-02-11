package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.*;

public class getCumulativePercentagesTest {
	
	@BeforeClass 
	public static void setUpBeforeClass() throws Exception {
    }
	
	@Before
	public void setUp() throws Exception{
		
	}
	
	//Test for getting cumulative percentages with data as NULL (invalid input)
	@Test(expected = InvalidParameterException.class)
	public void nullDataTest() {
		KeyedValues data = null;
		KeyedValues actual = DataUtilities.getCumulativePercentages(data);
	}

	//Test for getting cumulative percentages with one row of data as input
	@Test
	public void keyedValuesWithOneRowTest() {
		Mockery mockingContext = new Mockery();
		final KeyedValues kVal = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
				allowing(kVal).getItemCount();
				will(returnValue(1));
				allowing(kVal).getValue(0);
				will(returnValue(1));
				allowing(kVal).getKey(0);
				will(returnValue(0));
			}
		});
		KeyedValues kValResult = DataUtilities.getCumulativePercentages(kVal);
		assertEquals(1.0, kValResult.getValue(0));
	}
	
	//Test for getting cumulative percentages with three rows of data as input
	@Test
	public void keyedValuesWithThreeRowsTest() {
		Mockery mockingContext = new Mockery();
		final KeyedValues kVal = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
				allowing(kVal).getItemCount();
				will(returnValue(3));
				allowing(kVal).getValue(0);
				will(returnValue(5));
				allowing(kVal).getValue(1);
				will(returnValue(9));
				allowing(kVal).getValue(2);
				will(returnValue(2));
				allowing(kVal).getKey(0);
				will(returnValue(0));
				allowing(kVal).getKey(1);
				will(returnValue(1));
				allowing(kVal).getKey(2);
				will(returnValue(2));
			}
		});
		
		KeyedValues kValResult = DataUtilities.getCumulativePercentages(kVal);
		assertEquals(0.875, kValResult.getValue(1));
	}
	
	
	//Test for getting cumulative percentages with three rows of data (all zeros) as input
	@Test
	public void allRowsAreZeroTest(){
		Mockery mockingContext = new Mockery();
		final KeyedValues kVal = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
				allowing(kVal).getItemCount();
				will(returnValue(3));
				allowing(kVal).getValue(0);
				will(returnValue(0));
				allowing(kVal).getValue(1);
				will(returnValue(0));
				allowing(kVal).getValue(2);
				will(returnValue(0));
				allowing(kVal).getKey(0);
				will(returnValue(0));
				allowing(kVal).getKey(1);
				will(returnValue(1));
				allowing(kVal).getKey(2);
				will(returnValue(2));
			}
		});
		
		KeyedValues kValResult = DataUtilities.getCumulativePercentages(kVal);
		assertEquals(0.0/0.0, kValResult.getValue(0));
	}
	
	@After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

}
