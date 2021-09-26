package br.com.aab.challenge;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatableString {
   public static void main(String[] args) {
      final String input = "Quero vencer!";
      final int TIMES = 1000;

      long init = System.currentTimeMillis();
      Stream.iterate(input, i -> i + input + " ")
              .limit(TIMES)
              .collect(Collectors.joining());
      System.out.printf("Miliseconds [%d] using String\n", System.currentTimeMillis() - init);

      init = System.currentTimeMillis();
      Stream.iterate(new StringBuilder(), i -> i.append(input).append(" "))
              .limit(TIMES)
              .collect(Collectors.joining());
      System.out.printf("Miliseconds [%d] using StringBuilder\n", System.currentTimeMillis() - init);
   }
}
