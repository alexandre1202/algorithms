package br.com.aab.codingproblems.s012;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.stream.Collectors.joining;

public class RemovingDuplicatedChars {
    public String removingDuplicatedCharsSB(String word) {
        char[] charArray = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch : charArray) {
            if (stringBuilder.indexOf(String.valueOf(ch)) == -1) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public String removingDuplicatedCharsUsingHashSet(String words) {
        char[] charArray = words.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> characterSet = new HashSet<>();
        for (char ch : charArray) {
            if (characterSet.add(ch)) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public String removingDuplicatedCharsUsingStream(String words) {
        return Arrays.asList(words.split("")).stream().distinct().collect(joining());
    }
}
