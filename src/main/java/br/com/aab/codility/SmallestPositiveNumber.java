package br.com.aab.codility;

import java.util.Arrays;

public class SmallestPositiveNumber {
   public static void main(String[] args) {
      SmallestPositiveNumber smallest = new SmallestPositiveNumber();
      int[] A1 = {0, 18, 9, 4, -9, -4, 0, 2, -18}; //Result = 1
      int[] A2 = {1, 3, 6, 4, 1, 2};   // Result = 5
      System.out.println("result A1 = " + smallest.solution(A1));
      System.out.println("result A2 = " + smallest.solution(A2));
   }

   public int solution(int[] A) {
      int result = 0;
      Arrays.sort(A);
      for (int i = 0; i< A.length; i++) {
         if (A[i] >= 0 && A[i] > result) {
            if ((A[i] - result) > 1) {
               return ++result;
            } else {
               result = A[i];
            }
         }
      }
      return result;
   }
}
