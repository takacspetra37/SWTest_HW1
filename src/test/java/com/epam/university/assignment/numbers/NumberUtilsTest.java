package com.epam.university.assignment.numbers;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest {
	
	private NumberUtils undertest = new NumberUtils();
	
	@Test
	public void testDivisors_withPositive() {
		// GIVEN
		int number = 12;		
		// WHEN
		Set<Integer> results = undertest.getDivisors(number);
		
		Set<Integer> expected = new HashSet<Integer>(6);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(6);
		expected.add(12);	
		
		// THEN	
		Assert.assertEquals(expected, results);
	}
	
	@Test
	public void testDivisors_withPositive2() {
		// GIVEN
		int number = 6;		
		// WHEN
		Set<Integer> results = undertest.getDivisors(number);
		
		Set<Integer> expected = new HashSet<Integer>(6);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(6);		
		
		// THEN	
		Assert.assertEquals(expected, results);
	}
	
	@Test
	public void testPrime_withOne() {
		// GIVEN
		int number = 1;		
		// WHEN
		boolean result = undertest.isPrime(number);
				
		// THEN	
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testPrime_withZero() {
		// GIVEN
		int number = 0;		
		// WHEN
		boolean result = undertest.isPrime(number);
				
		// THEN	
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testPrime_withPrime() {
		// GIVEN
		int number = 2;		
		// WHEN
		boolean result = undertest.isPrime(number);
				
		// THEN	
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testPrime_withPrime2() {
		// GIVEN
		int number = 5;		
		// WHEN
		boolean result = undertest.isPrime(number);
				
		// THEN	
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testPrime_withNotPrime() {
		// GIVEN
		int number = 6;		
		// WHEN
		boolean result = undertest.isPrime(number);
				
		// THEN	
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testPrime_withNegative() {
		// GIVEN
		int number = -10;		
		try {
			undertest.isPrime(number);			
		} catch(IllegalArgumentException exc) {
			assertEquals("can't process negative number", exc.getMessage());
		}	
	}
	
	@Test
	public void testEvenOrOdd_withEven() {
		// GIVEN
		int number = 2;		
		// WHEN
		String result = undertest.evenOrOdd(number);
				
		// THEN	
		Assert.assertEquals("even", result);
	}
	
	@Test
	public void testEvenOrOdd_withOdd() {
		// GIVEN
		int number = 3;		
		// WHEN
		String result = undertest.evenOrOdd(number);
				
		// THEN	
		Assert.assertEquals("odd", result);
	}
	
	@Test
	public void testEvenOrOdd_withZero() {
		// GIVEN
		int number = 0;		
		// WHEN
		String result = undertest.evenOrOdd(number);
				
		// THEN	
		Assert.assertEquals("even", result);
	}

}