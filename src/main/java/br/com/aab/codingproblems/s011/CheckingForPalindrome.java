package br.com.aab.codingproblems.s011;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class CheckingForPalindrome {
    public boolean isPalindromeVerboseVersion(String word) {
        if (Objects.isNull(word) || word.equals("")) return false;
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() -1;
        while(left <= right) {
            if (word.charAt(left++) != word.charAt(right--)) return false;
        }
        return true;
    }

    public boolean isPalindromeWithStringBuilder(String word) {
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }

    public boolean isPalindromeWithStream(String word) {
        return IntStream.range(0, word.length() / 2)
                .noneMatch(i -> word.charAt(i) != word.charAt(word.length() - i - 1));
    }

    public static void main(String[] args) {
        CheckingForPalindrome checking = new CheckingForPalindrome();
        String[] words = {"civic", "radar", "level", "madam", "jorge", "daniel"};
        Arrays.stream(words).forEach(w -> System.out.println("the work " + " = " + checking.isPalindromeWithStream(w)));

    }
}
