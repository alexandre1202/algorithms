package br.com.aab.codingproblems.s020;

import java.util.Arrays;

import static java.util.Objects.isNull;
import static java.util.stream.Collectors.joining;

public class CharConcatenate {
    public String buildStringV1(Character character, int occurences) {
        if (isNull(character) || occurences < 1) return null;
        Character[] charOccurrences = new Character[occurences];
        Arrays.fill(charOccurrences, character);
        String result = Arrays.stream(charOccurrences).map(String::valueOf).collect(joining());
        return result;
    }

    public String buildStringV2(Character character, int nTimes) {
        return String.format("%" + nTimes + "s", " ").replace(' ', character);
    }
}
