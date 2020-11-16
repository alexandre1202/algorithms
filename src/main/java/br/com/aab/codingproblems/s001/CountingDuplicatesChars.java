package br.com.aab.codingproblems.s001;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicatesChars {

    private Map<Character, Long> map = new HashMap<>();
    private String params;

    public CountingDuplicatesChars(String params) {
        this.params = params;
    }

    public Map<Character, Long> count1() {
        for (char c : params.toCharArray()) {
            map.compute(c, (k, v) -> (v == null ? 1 : ++v));
        }
        return map;
    }

    public Map<Character, Long> count2() {
        return this.params.chars().mapToObj(c -> (char) c)
                       .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    public Map<Character, Long> count3WithStream() {
        return this.params.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    public Map<Character, Long> count3WithoutStream() {
        Map<Character, Long> result = new HashMap<>();
        char[] charArray = this.params.toCharArray();
        for (char c : charArray) {
            result.compute(c, (k, v) -> v == null ? 1 : ++v);
        }
        return result;
    }
}
