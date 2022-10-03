package br.com.aab.algorithms.hackerrank.preparationkit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class SparseArrays {
    static List<String> strings = Arrays.asList("ab", "ab", "abc");
    static List<String> queries = Arrays.asList("ab", "abc", "bc");
    static long start;

    public static List<Integer> matchingStringsSlowly(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for (String q : queries) {
            Long count = strings.stream().filter(s -> q.equals(s)).count();
            result.add(count.intValue());
        }
        return result;
    }

    public static List<Integer> matchingStringsLinkedListFastest(List<String> strings, List<String> queries) {
        List<Integer> result = new LinkedList<>();
        for (String q : queries) {
            Long count = strings.stream().filter(s -> q.equals(s)).count();
            result.add(count.intValue());
        }
        return result;
    }

    public static List<Integer> matchingStringsStream(List<String> strings, List<String> queries) {
        return queries.stream()
                .mapToInt(q -> (int) (strings.stream().filter(s -> q.equals(s)).count()))
                .boxed().collect(Collectors.toList());
    }

    public static List<Integer> matchingStringsStreamLinkedList(List<String> strings, List<String> queries) {
        return queries.stream()
                .mapToInt(q -> (int) (strings.stream().filter(s -> q.equals(s)).count()))
                .boxed().collect(Collectors.toCollection(LinkedList::new));
    }

    public static void main(String[] args) {
        start = System.currentTimeMillis();
        System.out.println(format("matchingStringsSlowly(strings, queries) [%s] in [%d] ms",
                matchingStringsSlowly(strings,queries),
                (System.currentTimeMillis() - start)));

        start = System.currentTimeMillis();
        System.out.println(format("matchingStringsStream(strings, queries) [%s] in [%d] ms",
                matchingStringsStream(strings,queries),
                (System.currentTimeMillis() - start)));

        start = System.currentTimeMillis();
        System.out.println(format("matchingStringsLinkedListFastest(strings, queries) [%s] in [%d] ms",
                matchingStringsLinkedListFastest(strings,queries),
                (System.currentTimeMillis() - start)));

        start = System.currentTimeMillis();
        System.out.println(format("matchingStringsStreamLinkedList(strings, queries) [%s] in [%d] ms",
                matchingStringsStreamLinkedList(strings,queries),
                (System.currentTimeMillis() - start)));

    }
}
