package br.com.aab.codingproblems.s011;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CheckingForPalindromeTest {

    private CheckingForPalindrome checkingForPalindrome;

    @Before
    public void setUp() throws Exception {
        checkingForPalindrome = new CheckingForPalindrome();
    }

    @Test
    public void testIsPalindrome() {
        String expected = "Madam";
        boolean result = checkingForPalindrome.isPalindrome(expected);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsNotPalindrome() {
        String expected = "Alexandre";
        boolean result = checkingForPalindrome.isPalindrome(expected);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsPalindromeWithNumbers() {
        String expected = "32123";
        boolean result = checkingForPalindrome.isPalindrome(expected);
        Assertions.assertTrue(result);
    }
}