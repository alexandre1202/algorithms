package br.com.aab.codingproblems.s002;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingFirstNonRepeatedChar {
    private String param;

    public FindingFirstNonRepeatedChar(String param) {
        this.param = param;
    }

    public String find() {
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
}
