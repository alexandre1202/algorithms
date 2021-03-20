package br.com.aab.codingproblems.s005;

import br.com.aab.codingproblems.s001.Pair;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

@Getter
@Setter
public class CountingVowelsAndConsonants {
    private static Set<Character> vogais = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Pair<Long, Long> countVowelsAndConsonantsV1(String words) {
        words = words.toLowerCase();

        long numVowels = words
                 .chars()
                 .filter(c -> vogais.contains((char)c))
                 .count();
        long numConsonants = words
                .chars()
                .filter(c -> !vogais.contains((char)c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();

        return Pair.of(numVowels, numConsonants);
    }

    public static Pair<Long, Long> countVowelsAndConsonantsV2(String words) {
        words = words.toLowerCase();
        Map<Boolean, Long> result = words.chars()
                            .mapToObj(c -> (char) c)
                            .filter(c -> (c >= 'a' && c <= 'z'))
                            .collect(partitioningBy(c -> vogais.contains(c), counting()));
        return Pair.of(result.get(true), result.get(false));
    }

    public static PairVC<Long, Long> countVogaisEConsoantes(String words) {
        words = words.toLowerCase();
        Map<Boolean, Long> result = words.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> c >= 'a' && c <= 'z')
                .collect(partitioningBy(c -> vogais.contains(c), counting()));
        return PairVC.of(result.get(true), result.get(false));
    }
}
