package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringCalculator;

public class StringClaculatorTest {
	
	StringCalculator calculator=new StringCalculator();
	
	@Test
	public void testEmptyString() {
		assertEquals(0, calculator.add(""));
	}
	
	@Test
	public void testSingleNumber() {
		assertEquals(1,calculator.add("1"));
	}
	
	@Test
	public void testMultipleNumbers() {
		assertEquals(6,calculator.add("1,2,3"));
	}

}
