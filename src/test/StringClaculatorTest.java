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

}
