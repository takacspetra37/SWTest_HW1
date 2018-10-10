package com.epam.university.assignment.strings;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.epam.university.assignment.numbers.NumberUtils;

public class PalidromCheckTest {
	
	private PalidromCheck undertest = new PalidromCheck();
	
	@Test
	public void testPalindrom_withPalindrom() {
		// GIVEN
		String pali = "alapala";
		
		// WHEN
		boolean result = undertest.isPalindrom(pali);
		
		// THEN	
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testPalindrom_withPalindromCaseSensitive() {
		// GIVEN
		String pali = "alApaLa";
		
		// WHEN
		boolean result = undertest.isPalindrom(pali);
		
		// THEN	
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testPalindrom_withNotPalindrom() {
		// GIVEN
		String pali = "alapdssgrvdala";
		
		// WHEN
		boolean result = undertest.isPalindrom(pali);
		
		// THEN	
		Assert.assertEquals(false, result);
	}

}