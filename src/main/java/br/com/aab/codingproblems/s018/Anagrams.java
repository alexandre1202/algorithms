package br.com.aab.codingproblems.s018;

public class Anagrams {

    private static final int EXTENDED_ASCII_CODES = 256;

    public boolean isAnagram(String word1, String word2) {
        int[] chCounts = new int[EXTENDED_ASCII_CODES];
        char[] charOfWord1 = word1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charOfWord2 = word2.replaceAll("\\s", "").toLowerCase().toCharArray();

        if (charOfWord1.length != charOfWord2.length) return false;

        for (int i = 0; i < charOfWord1.length; i++) {
            chCounts[charOfWord1[i]]++;
            chCounts[charOfWord2[i]]--;
        }

        for (int i = 0; i < chCounts.length; i++) {
            if (chCounts[i] != 0) return false;
        }

        return true;
    }
}
