package br.com.aab.codingproblems.s009;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class JoiningStringsFromDelimiter {
    public String joiningStringsWith(String delimiter, String... strings) {
        return Arrays.stream(strings, 0, strings.length).collect(joining(String.valueOf(delimiter)));
    }
}
