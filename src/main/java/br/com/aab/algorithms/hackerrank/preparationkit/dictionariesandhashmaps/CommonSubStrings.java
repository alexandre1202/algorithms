package br.com.aab.algorithms.hackerrank.preparationkit.dictionariesandhashmaps;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Map;
import java.util.Objects;

public class CommonSubStrings {
    public static String twoStrings(String s1, String s2) {
        final Map<Character, Long> mapS1 = s1.chars().mapToObj(c -> (char) c).collect(groupingBy(c -> c, counting()));
        for (int i = 0; i < s2.length() -1; i++) {
            if (Objects.nonNull(mapS1.get(s2.charAt(i)))) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String s1, s2;

        s1 = "hello";
        s2 = "world";
        System.out.println(s1 + " :  and : " + s2 + " = YES: " + CommonSubStrings.twoStrings(s1, s2));

        s1 = "art";
        s2 = "and";
        System.out.println(s1 + " :  and : " + s2 + " = YES: " + CommonSubStrings.twoStrings(s1, s2));

        s1 = "be";
        s2 = "cat";
        System.out.println(s1 + " :  and : " + s2 + " = NO: " + CommonSubStrings.twoStrings(s1, s2));
    }
}
