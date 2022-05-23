package br.com.aab.functionalprogramming;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPartitionBy {
    public static void main(String[] args) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        List<String> months = Arrays.stream(dateFormatSymbols.getMonths()).collect(Collectors.toList());

        Map<Boolean, List<String>> monthsNamesGreatherThanFive = months.stream()
                 .collect(Collectors.partitioningBy(m -> m.length() > 5));
        monthsNamesGreatherThanFive.entrySet().stream().forEach(System.out::println);
    }
}
