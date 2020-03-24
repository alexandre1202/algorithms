package br.com.aab.algorithms;

public class MergeSort {

    public void sortExec(int[] input) {
        split(input, 0, input.length);
    }

    private int[] split(int[] input, int start, int end) {
        if ((end - start) < 2) return null;

        int mid = (end - start) / 2;

        split(input, start, mid);
        split(input, mid, end);
        //merge(input, start, mid, end);

        return input;
    }



}
