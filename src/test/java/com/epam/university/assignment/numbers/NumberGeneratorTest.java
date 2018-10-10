package com.epam.university.assignment.numbers;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NumberGeneratorTest {
	
private NumberGenerator undertest = new NumberGenerator();
	
	@Test
	public void test_even() {
		// GIVEN
		int limit = 6;		
		// WHEN
		int result = undertest.generateEven(limit);
		// THEN	
		Assert.assertTrue(result <= limit);
		Assert.assertTrue((result % 2) == 0);
	}
	
	@Test
	public void test_odd() {
		// GIVEN
		int limit = 26;		
		// WHEN
		int result = undertest.generateOdd(limit);
		// THEN	
		Assert.assertTrue(result <= limit);
		Assert.assertTrue((result % 2) == 1);
	}
	
	@Test
	public void test_evenWithNegative() {
		// GIVEN
		int limit = -6;		
				
		try {
			undertest.generateEven(limit);			
		} catch(IllegalArgumentException exc) {
			assertEquals("bound must be positive", exc.getMessage());
		}		
	}
	
	@Test
	public void test_oddWithNegative() {
		// GIVEN
		int limit = -36;		
				
		try {
			undertest.generateOdd(limit);			
		} catch(IllegalArgumentException exc) {
			assertEquals("bound must be positive", exc.getMessage());
		}		
	}
	
	@Test
	public void test_evenWithMax() {
		// GIVEN
		int limit = Integer.MAX_VALUE;	
				
		// WHEN
		int result = undertest.generateEven(limit);
		
		// THEN	
		Assert.assertTrue(result <= limit);
		Assert.assertTrue((result % 2) == 0);	
	}
	
	@Test
	public void test_oddWithMax() {
		// GIVEN
		int limit = Integer.MAX_VALUE;	
				
		// WHEN
		int result = undertest.generateOdd(limit);
		
		// THEN	
		Assert.assertTrue(result <= limit);
		Assert.assertTrue((result % 2) == 1);	
	}
	
	@Test
	public void test_evenWithZero() {
		// GIVEN
		int limit = 0;	
				
		try {
			undertest.generateEven(limit);			
		} catch(IllegalArgumentException exc) {
			assertEquals("bound must be positive", exc.getMessage());
		}		
	}
	
	@Test
	public void test_oddWithZero() {
		// GIVEN
		int limit = 0;	
				
		try {
			undertest.generateOdd(limit);			
		} catch(IllegalArgumentException exc) {
			assertEquals("bound must be positive", exc.getMessage());
		}		
	}
	
}