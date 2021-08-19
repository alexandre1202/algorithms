package br.com.aab.hackerrankprepkit.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LeftRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("rotLeft() => " + Arrays.toString(rotLeft(array, 2)));

        int[] array2 = {1, 2, 3, 4, 5};
        List<Integer> aList = Arrays.stream(array2).boxed().collect(Collectors.toList());
        System.out.println("array2 = " + Arrays.toString(array2));
        System.out.println("rotLeft() => " + rotationLeft(aList, 2));
    }

    static int[] rotLeft(int[] a, int d) {
        while (d-- > 0) {
            int aux = a[0];
            for (int x = 0; x < a.length - 1; x++) {
                a[x] = a[x + 1];
            }
            a[a.length - 1] = aux;
        }
        return a;
    }

    static List<Integer> rotationLeft(List<Integer> a, int d) {
        while (d-- > 0) {
            a.add(a.remove(0));
            System.out.println("a = " + a);
        }
        return a;
    }
}
