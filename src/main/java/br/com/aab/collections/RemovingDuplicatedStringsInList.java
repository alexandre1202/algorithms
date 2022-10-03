package br.com.aab.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicatedStringsInList {

    public List<String> removeDup(List<String> duplicatedValues) {
        List<String> result = duplicatedValues.stream().distinct().collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        final List<String> list1 = Arrays.asList("Ale", "Gaby", "João", "Maria", "Gaby", "Ale");
        final List<String> result = new RemovingDuplicatedStringsInList().removeDup(list1);
        System.out.println("Result: ");
        result.forEach(System.out::print);
    }
}
