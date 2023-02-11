package org.jfree.data.testsuite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

	org.jfree.data.test.RangeConstrainTest.class,
	
	org.jfree.data.test.RangeContainsTest.class,
	
	org.jfree.data.test.RangeGetLengthTest.class,
	
	org.jfree.data.test.createNumberArray2DTest.class,
	
	org.jfree.data.test.DataUtilitiesTest.class,
	
	org.jfree.data.test.getCumulativePercentagesTest.class,
	
	org.jfree.data.test.GetLowerBoundTest.class,
	
	org.jfree.data.test.GetUpperBoundTest.class
	
})
public class TestSuite {


}
