package br.com.aab.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] list = {5, 8, 1, 6, 9, 2};
        Arrays.stream(list).forEach(System.out::print);
        bubbleSort(list);
        System.out.println();
        bubbleSort(list);
        Arrays.stream(list).forEach(System.out::print);
        list = new int[0];
        System.out.println();
        bubbleSort(list);
        Arrays.stream(list).forEach(System.out::print);
    }

    public static void bubbleSort(int[] list) {
        int i, j, temp;
        if (list == null) return;
        if (list.length < 2) return;

        for (i = 0; i < list.length; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j+1]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    public int[] sortExec(int[] num) {
        if (num == null) return null;

        if ( num.length < 2 ) return num;

        for (int lastUnsortedIndex = num.length-1;
             lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (num[j] > num[j+1]) {
                    swapNumbers(num, j, j+1);
                }
            }
        }
        return num;
    }

    private void swapNumbers(int[] array, Integer x, Integer y) {
        Integer temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
