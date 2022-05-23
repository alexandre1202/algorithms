package br.com.aab.functionalprogramming;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReusablePredicate {

    public static void main(String[] args) {

        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        List<String> months = Arrays.stream(dateFormatSymbols.getMonths()).collect(Collectors.toList());
        Function<Integer, Predicate<String>> buildFilter = (minLength) ->
            str -> str.length() > minLength;

        months.stream().filter(buildFilter.apply(7)).forEach(System.out::println);

    }
}
