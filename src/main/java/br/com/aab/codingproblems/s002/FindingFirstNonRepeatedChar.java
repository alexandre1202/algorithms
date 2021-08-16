package br.com.aab.codingproblems.s002;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Character.MIN_VALUE;
import static java.lang.Character.toChars;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindingFirstNonRepeatedChar {
    private String param;

    public FindingFirstNonRepeatedChar(String param) {
        this.param = param;
    }

    public String findV1() {
        Map<Integer, Long> map = this.param.codePoints()
                      .mapToObj(cp -> cp)
                      .collect(groupingBy(
                              identity(),
                              LinkedHashMap::new,
                              counting()));
        int cp = map.entrySet().stream()
                         .filter(e -> e.getValue() == 1L)
                         .findFirst()
                         .map(Map.Entry::getKey)
                         .orElse(Integer.valueOf(MIN_VALUE));
        return String.valueOf(toChars(cp));
    }

    public String findV2() {
        Map<Integer, Long> mapChar = this
            .param.codePoints()
            .mapToObj(c -> c)
            .collect(groupingBy(identity(), LinkedHashMap::new, counting()));
        return String.valueOf(toChars(mapChar.entrySet().stream()
                        .filter(f -> f.getValue() == 1L)
                        .findFirst()
                        .map(Map.Entry::getKey)
                        .orElse(Integer.valueOf(MIN_VALUE))));
    }
}
