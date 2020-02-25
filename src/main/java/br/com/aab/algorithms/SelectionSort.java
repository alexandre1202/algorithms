package br.com.aab.algorithms;

import java.util.Objects;

public class SelectionSort {

    public int[] sortSelectionSort(int[] nums) {
        if (Objects.isNull(nums)) return null;

        for (int lastUnsortedIndex = nums.length - 1;
             lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (nums[i] > nums[largest]) {
                    largest = i;
                }
            }
            swapNumbers(nums, largest, lastUnsortedIndex);
        }
        return nums;
    }

    private void swapNumbers(int[] array, Integer x, Integer y) {
        Integer temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
