package br.com.aab.interviewquestions;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class ListConverter {
   public static void main(String[] args) {
      List<String> result = convert(Arrays.asList(1,2,3,4,5,6), s -> String.valueOf(s));
      result.forEach(System.out::println);

      result = convert(Arrays.asList(
              LocalDate.now().minusDays(1), LocalDate.now().minusDays(3), LocalDate.now().minusDays(7)),
              s -> String.valueOf(s));
      result.forEach(System.out::println);
   }

   static <T, U> List<U> convert(List<T> input, Function<T, U> function) {
      return input.stream().map(function).collect(toList());
   }
}
