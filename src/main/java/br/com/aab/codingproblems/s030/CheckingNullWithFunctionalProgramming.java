package br.com.aab.codingproblems.s030;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckingNullWithFunctionalProgramming {

    public String getNameFromListNotNull(List<String> names, String name) {
        return names.stream()
             .filter(Objects::nonNull)
             .filter(n -> name.equals(n)).findFirst().orElse("Not Found");
    }

    public String getNameFromMap(ConcurrentHashMap map, String key) {
        return Optional.ofNullable(map.get(key)).orElse("Not Found").toString();
    }
}
