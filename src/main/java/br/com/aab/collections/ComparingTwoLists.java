package br.com.aab.collections;

import java.util.Arrays;
import java.util.List;

public class ComparingTwoLists {
    public boolean compare(List list1, List list2) {
        return list1.equals(list2);
    }

    public static void main(String[] args) {
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(new ComparingTwoLists().compare(integers1, integers2));
    }
}
