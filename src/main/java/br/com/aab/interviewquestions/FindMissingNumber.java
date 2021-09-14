package br.com.aab.interviewquestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class FindMissingNumber {
   public static void main(String[] args) {
      int[] param = new int[] {1, 2, 3, 4, 6, 7, 8, 9, 10};
      System.out.println(Arrays.toString(param) + " = " + find(param));

      param = new int[] {1, 2, 3, 5, 6, 7, 8, 9, 10};
      System.out.println(Arrays.toString(param) + " = " + find(param));

      param = new int[] {1, 2, 3};
      System.out.println(Arrays.toString(param) + " = " + find(param));

      param = new int[] {0};
      System.out.println(Arrays.toString(param) + " = " + find(param));

      param = new int[] {1, 2};
      System.out.println(Arrays.toString(param) + " = " + find(param));

      param = new int[] {2, 3, 4, 6, 7, 8};
      System.out.println(Arrays.toString(param) + " = " + find(param));
   }
   public static int find(final int[] sequence) {
      IntSummaryStatistics iss = Arrays.stream(sequence).summaryStatistics();
      long lower = iss.getMin(), higher = iss.getMax(), sum = iss.getSum();
      long result = (lower + higher) * (higher - lower + 1) / 2 - sum;
      return Long.valueOf(result).intValue();
   }
}
