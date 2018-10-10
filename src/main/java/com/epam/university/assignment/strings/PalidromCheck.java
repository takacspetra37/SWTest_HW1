package com.epam.university.assignment.strings;

/**
 * https://hu.wikipedia.org/wiki/Palindrom
 */
public class PalidromCheck {

    public boolean isPalindrom(String str){
    	// To be insensitive to capital letters
    	str = str.toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();
        // Definition of palindrom: comparing the word and the reversed word
        return reverse.equals(str);
    }

}
