package br.com.aab.algorithms;

import static java.util.Objects.isNull;

public class InsertionSort {
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
