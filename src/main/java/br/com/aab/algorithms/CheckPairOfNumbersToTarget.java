package br.com.aab.algorithms;

import java.util.ArrayList;
import java.util.List;

public class CheckPairOfNumbersToTarget {
    public static List<Integer[]> checkingPairs(int[] pairs, int target) {
        int left = 0;
        int right = pairs.length - 1;
        List<Integer[]> result = new ArrayList<>();
        while (left < right) {
            if ((pairs[left] + pairs[right]) > target) {
                right--;
            } else if ((pairs[left] + pairs[right]) < target) {
                left++;
            } else {
                result.add(new Integer[] {pairs[left], pairs[right]});
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 6, 8, 9, 12, 14, 15};
        int target = 13;
        checkingPairs(input, target)
                .forEach(e -> System.out.println("Sum [" + e[0] + "] and [" + e[1] + "] are " +
                                                                             "igual to " + target));
    }
}

