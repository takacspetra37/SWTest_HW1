package com.epam.university.assignment.strings;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyInt;

import org.junit.Assert;
import org.junit.Test;

import com.epam.university.assignment.numbers.NumberGenerator;

public class NumberStringGeneratorTest {
	
	private NumberGenerator generator; // = new NumberGenerator();
	private NumberStringGenerator undertest; // = new NumberStringGenerator(generator);
	
	@Test
	public void testGenerateString_() {
		
		generator = mock(NumberGenerator.class);
		
		when(generator.generateEven(anyInt())).thenReturn(6);
		when(generator.generateOdd(anyInt())).thenReturn(7);
		
		undertest = new NumberStringGenerator(generator);		
		
		// WHEN
		int num = 3;
		String[] result = undertest.generateString(num, 7);
		String[] expected = new String[] {"6,7", "6,7", "6,7"};
		
		// THEN	
		Assert.assertEquals(expected, result);
		
		verify(generator, times(num)).generateEven(anyInt());
		verify(generator, times(num)).generateOdd(anyInt());
	}
	
	@Test
	public void testGenerateString_null() {
		
		generator = mock(NumberGenerator.class);
		
		when(generator.generateEven(anyInt())).thenReturn(6);
		when(generator.generateOdd(anyInt())).thenReturn(7);
		
		undertest = new NumberStringGenerator(generator);		
		
		// WHEN
		int num = 0;
		String[] result = undertest.generateString(num, 7);
		String[] expected = new String[] {};
		
		// THEN	
		Assert.assertEquals(expected, result);
		
		verify(generator, times(num)).generateEven(anyInt());
		verify(generator, times(num)).generateOdd(anyInt());
	}

}