package br.com.aab.algorithms.br.com.aab.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        System.out.println("antes - a = " + a);
        int i = 0;
        while (i < (a.size() / 2)) {
            int temp = a.get(i);
            a.set(i, a.get(a.size()-(i + 1)));
            a.set(a.size()-(i+1), temp);
            i++;
        }
        return a;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 4, 8, 3, 5, 0, 2, 7);
        reverseArray(input);
    }
}
