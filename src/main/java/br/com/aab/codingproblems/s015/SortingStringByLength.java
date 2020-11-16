package br.com.aab.codingproblems.s015;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.*;

public class SortingStringByLength {
    public String[] arrayStringSortedByLength(String[] words, Sort direction) {
        int order = direction.equals(Sort.ASC) ? 1 : -1;
        sort(words, (String str1, String str2) -> (order) * Integer.compare(str1.length(), str2.length()));
        return words;
    }

    public String[] arrayStringSortedByLengthUsingComparator(String[] words, Sort direction) {
        if (direction.equals(Sort.ASC)) {
            sort(words, Comparator.comparingInt(String::length));
        } else {
            sort(words, Comparator.comparingInt(String::length).reversed());
        }
        return words;
    }

    public enum Sort {
        ASC, DESC;
    }
}
