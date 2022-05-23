package br.com.aab.functionalprogramming;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MonthsInCollectorsGroupedBy {
    public static void main(String[] args) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        List<String> months = Arrays.stream(dateFormatSymbols.getMonths()).collect(Collectors.toList());
        Map<Integer, List<String>> monthByLengh = months.stream()
            .filter(m -> m.length() > 0)
            .collect(Collectors.groupingBy(m -> m.length()));
        monthByLengh.entrySet().forEach(System.out::println);
    }
}
