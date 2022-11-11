package br.com.aab.algorithms.hackerrank.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class Knapsack {
    public static int unboundedKnapsack(int k, List<Integer> arr) {
        Integer[] intArray = arr.toArray(new Integer[0]);
        Arrays.sort(intArray);
        int left = 0;
        int right = intArray.length;
//        while (left < right) {
//            final int sum = intArray[left] + intArray[right];
//            if (sum < k) {
//                right--;
//            } else if (sum > k) {
//                left++;
//            } else {
//
//            }
//        }
        return 0;
    }
}
