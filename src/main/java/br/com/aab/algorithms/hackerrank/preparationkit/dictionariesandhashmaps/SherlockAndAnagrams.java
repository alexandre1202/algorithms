package br.com.aab.algorithms.hackerrank.preparationkit.dictionariesandhashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {
    public static int sherlockAndAnagrams(String s) {
        if (s == null || s.trim().length() == 0) return 0;
        Map<String, Integer> frequency = new HashMap<>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char[] possibilities = s.substring(i, j+1).toCharArray();
                Arrays.sort(possibilities);
                String k = new String(possibilities);
                frequency.put(k, (frequency.containsKey(k) ? frequency.get(k) : 0) + 1);
            }
        }

        for (String k : frequency.keySet()) {
            final int v = frequency.get(k);
            System.out.println("k = " + k + ", v = " + v);
            result += (v * (v - 1)) / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] strInput = new String[][] {
                {"mom", "3"},
                {"abba", "4"},
                {"abcd", "0"}, {null, "0"}, {"ifailuhkqq","3"}, {"kkkk", "10"}
        };
        Arrays.stream(strInput)
                .forEach(strPair -> System.out.println(
                        "input = [" + Arrays.asList(strPair).get(0) + "]"
                        + " / Expected = " + Arrays.asList(strPair).get(1)
                        + " - Result" + " = " + sherlockAndAnagrams(strPair[0])));
    }
}
