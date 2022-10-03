package br.com.aab.algorithms;

import static java.util.Objects.isNull;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] list) {
        int i, j, key, temp;
        for (i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && key < list[j]) {
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 8, 1, 6, 9, 2};
        Arrays.stream(list).forEach(System.out::print);
        insertionSort(list);
        System.out.println();
        Arrays.stream(list).forEach(System.out::print);
        list = new int[0];
        System.out.println();
        Arrays.stream(list).forEach(System.out::print);
    }

    public int[] sortExec(int[] nums) {
        if (isNull(nums)) return null;

        if (nums.length < 2) return nums;

        for (int traversalIndex = 1; traversalIndex <= nums.length - 1; traversalIndex++) {
            int insertionSortIndex = traversalIndex;
            for (int i = traversalIndex -1; i >= 0; i--) {
                if (nums[insertionSortIndex] < nums[i]) {
                    int numberSaved = nums[i];
                    nums[i] = nums[insertionSortIndex];
                    nums[insertionSortIndex] = numberSaved;
                    insertionSortIndex--;
                }
            }
        }
        return nums;
    }
}
