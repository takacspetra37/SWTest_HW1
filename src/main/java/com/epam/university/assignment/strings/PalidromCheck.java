package com.epam.university.assignment.strings;

/**
 * https://hu.wikipedia.org/wiki/Palindrom
 */
public class PalidromCheck {

    public boolean isPalindrom(String str){
    	str = str.toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse.equals(str);
    }

}
