package br.com.aab.algorithms;

import java.util.Arrays;

public class MergeSort {

    public void sortExec(int[] input) {
        split(input, 0, input.length);
        System.out.println("input = " + Arrays.toString(input));
    }

    private void split(int[] input, int start, int end) {
        if (end - start < 2) return;

        int mid = (end + start) / 2;

        split(input, start, mid);
        split(input, mid, end);
        mergeSort   (input, start, mid, end);
    }

    private void mergeSort(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0 , input, start, tempIndex);
    }

}
