package br.com.aab.codility.agileengine;

import java.awt.Color;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

enum COLOR { NORTH, SOUTH, WEST, EAST }

public class VisitCounter {

    Map<Long, Long> count(Map<String, UserStats>... visits) {
//        Arrays.stream(visits).map(Map::keySet).collect(Collectors.groupingBy(Function.identity(),
//                LinkedHashMap::new,
//                Collectors.counting()))
        Arrays.stream(visits).map(v -> Objects.isNull(v.keySet()));





        return null;
    }

    class UserStats {
        Optional<Long> visitCount;
    }
}
