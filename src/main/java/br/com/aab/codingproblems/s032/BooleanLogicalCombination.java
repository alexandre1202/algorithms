package br.com.aab.codingproblems.s032;

import java.util.Arrays;

public class BooleanLogicalCombination {
   public static void main(String[] args) {
      int x = 10;
      int y = 5;
      boolean result = Boolean.logicalAnd(x >= 10, y <= 5);
      System.out.println("logicalAnd(x >= 10, y <= 5) = " + result);
   }
}
