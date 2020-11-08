package br.com.aab.codingproblems.s010;

import java.util.HashSet;
import java.util.Set;

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
}
