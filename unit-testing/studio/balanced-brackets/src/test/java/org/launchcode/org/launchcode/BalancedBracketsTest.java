package org.launchcode;

import org.junit.jupiter.api.Test;
import org.launchcode.BalancedBrackets;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {


    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Refactor example test from instructions to use AAA pattern and message parameter
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

    //Testing balnced brackets in front of other characters - "[]LaunchCode"
    @Test
    public void bracketsBeforeStringReturnsTrue() {
        String message  = "brackets sets before a String always returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"), message);
    }

    // Testing Balanced brackets around other characters - "[LaunchCode]"
    @Test

    public void bracketsBeforeAndAfterStringReturnsTrue(){
        String message = "Brackets set before and after a string should return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"), message);
    }
    // Testing balanced brackets within other characters - "Launch[Code]"

    @Test
    public void bracketsWithinOtherCharactersReturnsTrue() {
        String message = "Brackets set within other characters should return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"), message);
    }
    //Testing  multiple consecutive pairs of balanced brackets - "[][][]"
    @Test
    public void tripleBalancedBrackets() {
        String message = "Three consecutive pairs of brackets return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"), message);
    }
    // Testing multiple nested balanced brackets - "[[[]]]"

    @Test
    public void multipleBalancedBrackets() {
        String message = "multiple nested balanced brackets should return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    // Testing a single open brackets

    @Test
    public void singleOpenBrackets() {
        String message = "Single open bracket should return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("["), message);
    }
    @Test
    public void singleCloseBrackets() {
        String message = "Single close bracket should return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"), message);
    }
    // Testing reversed Character - "]["
    @Test
    public void reversedBrackets() {
        String message = "Reversed brackets should return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["), message);
    }
    //Testing single brackets with other characters -
    @Test
    public void singleBrackets() {
        String message = "Single open bracket within a string should return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"), message);
    }

    // Testing Unbalanced brackets among other characters - "Launch]Code["
    @Test
    public void unbalancedBrackets(){
        String message  =  "Unbalanced Brackets withinn a string should return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["), message);
    }

    //Testing  a series of mixed, unbalanced brackets - "[[]][]]["

    @Test
    public void seriesOfMixedUnbalancedBrackets() {
        String message = "Series of Mixed, Unbalanced bracket should return false";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]][]]["), message);
    }
    //Test String with only characters other than brackets - "LaunchCode"  example of edge case
    @Test
    public void stringOfCharactersWithoutBrackets() {
        String message = "String of characters without  brackets should return true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"), message);
    }
    // Testing Empty String
    @Test
    public void emptyString() {
        String message = "empty string returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "), message);
    }


}