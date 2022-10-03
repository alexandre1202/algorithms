package br.com.aab.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemovingDuplicatedNumberInAList {
    public List<Integer> removingDuplicated(List integers) {
        return new ArrayList<>(new LinkedHashSet<>(integers));
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 0, 3, 1, 2, 3, 0, 0);
        List<Integer> result = new RemovingDuplicatedNumberInAList().removingDuplicated(integers);
        System.out.println("= input = ");
        integers.forEach(System.out::print);
        System.out.println("\n= output = ");
        result.forEach(System.out::print);
    }
}
