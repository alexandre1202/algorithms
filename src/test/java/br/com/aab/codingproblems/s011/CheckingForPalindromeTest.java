package br.com.aab.codingproblems.s011;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CheckingForPalindromeTest {

    private CheckingForPalindrome checkingForPalindrome;

    @Before
    public void setUp() throws Exception {
        checkingForPalindrome = new CheckingForPalindrome();
    }

    @Test
    public void testIsPalindrome() {
        String expected = "Madam";
        boolean result = checkingForPalindrome.isPalindromeVerboseVersion(expected);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsNotPalindrome() {
        String expected = "Alexandre";
        boolean result = checkingForPalindrome.isPalindromeVerboseVersion(expected);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsPalindromeWithNumbers() {
        String expected = "32123";
        boolean result = checkingForPalindrome.isPalindromeVerboseVersion(expected);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPalindromeSB() {
        String expected = "Madam";
        boolean result = checkingForPalindrome.isPalindromeWithStringBuilder(expected);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsNotPalindromeSB() {
        String expected = "Alexandre";
        boolean result = checkingForPalindrome.isPalindromeWithStringBuilder(expected);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsPalindromeWithNumbersSB() {
        String expected = "32123";
        boolean result = checkingForPalindrome.isPalindromeWithStringBuilder(expected);
        Assertions.assertTrue(result);
    }
}