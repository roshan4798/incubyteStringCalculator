package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
	
	@Test
	public void testNewLineBetweenNumbers() {
		assertEquals(6, calculator.add("1\n2,3"));
	}
	
	@Test
	public void testNegativeNumbers() {
		assertThrows(IllegalArgumentException.class, ()->calculator.add("-1,2,-3"));
	}
	
	@Test
	public void testDifferentDelimiter() {
		assertEquals(3,calculator.add("//;\n1;2"));
	}

}
