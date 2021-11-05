package br.com.aab.codingproblems.s010;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Permutation {

    public Set<String> permute(String word) {
        return permute("", word);
    }

    public Set<String> permute(String prefix, String word) {
        Set<String> permutationSet = new HashSet<>();
        int n = word.length();
        if (n == 0) {
            permutationSet.add(prefix);
        } else {
            for(int i = 0; i < n; i++) {
                permutationSet.addAll(permute(prefix + word.charAt(i), word.substring(i+1, n) + word.substring(0,i)));
            }
        }
        return permutationSet;
    }

    public void permuteAndPrint(String word) {
        permuteAndPrint("", word);
    }

    public void permuteAndPrint(String prefix, String word) {
        int n = word.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for(int i = 0; i < n; i++) {
                permuteAndPrint(prefix + word.charAt(i), word.substring(i + 1, n) + word.substring(0,i));
            }
        }
    }

    public static Stream<String> permuteAndReturnStream(String str) {

        if (str == null || str.trim().length() == 0) {
            return Stream.of("");
        }

        return IntStream.range(0, str.length())
                .parallel()
                .boxed()
                .flatMap(i -> permuteAndReturnStream(str.substring(0, i) + str.substring(i + 1))
                        .map(c -> str.charAt(i) + c)
                );
    }
}
