package br.com.aab.codingproblems.s011;

import java.util.Objects;

public class CheckingForPalindrome {
    public boolean isPalindrome(String word) {
        if (Objects.isNull(word) || word.equals("")) return false;
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() -1;
        while(left <= right) {
            if (word.charAt(left++) != word.charAt(right--)) return false;
        }
        return true;
    }
}
