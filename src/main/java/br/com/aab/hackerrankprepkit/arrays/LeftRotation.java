package br.com.aab.hackerrankprepkit.arrays;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("rotLeft() => " + Arrays.toString(rotLeft(array, 2)));
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
}

// Memoria
/*
array[0] = 1;
array[1] = 1;
array[2] = 1;
array[3] = 1;
array[4] = 1;
 */
