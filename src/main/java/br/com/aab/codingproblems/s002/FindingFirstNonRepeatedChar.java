package br.com.aab.codingproblems.s002;


import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindingFirstNonRepeatedChar {
    private String param;

    public FindingFirstNonRepeatedChar(String param) {
        this.param = param;
    }

    public String find() {
        Map<Integer, Long> mapChar = this.param.codePoints().mapToObj(c -> c)
                .collect(groupingBy(identity(), LinkedHashMap::new,counting()));
        return String.valueOf(Character.toChars(mapChar.entrySet().stream().filter(c -> c.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE))));
    }
}
