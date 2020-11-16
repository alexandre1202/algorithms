package br.com.aab.codingproblems.s002;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingFirstNonRepeatedChar {
    private String param;

    public FindingFirstNonRepeatedChar(String param) {
        this.param = param;
    }

    public String findV1() {
        Map<Integer, Long> map = this.param.codePoints()
                      .mapToObj(cp -> cp)
                      .collect(Collectors.groupingBy(
                              Function.identity(),
                              LinkedHashMap::new,
                              Collectors.counting()));
        int cp = map.entrySet().stream()
                         .filter(e -> e.getValue() == 1L)
                         .findFirst()
                         .map(Map.Entry::getKey)
                         .orElse(Integer.valueOf(Character.MIN_VALUE));
        return String.valueOf(Character.toChars(cp));
    }

    public String findV2() {
        Map<Integer, Long> mapCouting = this.param.codePoints()
                .mapToObj(c -> c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        int result = mapCouting
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));
        return String.valueOf(Character.toChars(result));
    }
}
