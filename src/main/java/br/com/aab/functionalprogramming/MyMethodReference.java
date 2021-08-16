package br.com.aab.functionalprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class MyMethodReference {

    public static void main(String[] args) {
        MyMethodReference.convertIntToString("2021");
        MyMethodReference.listContains(Arrays.asList("K", "V", "J", "X"), "X");
        MyMethodReference.listContains(Arrays.asList("K", "V", "J", "X"), "W");
        MyMethodReference.sumHugeNumbers(923874923742977L, 972364214917L);
        MyMethodReference.sumHugeNumbers(3L, 7L);
    }

    private static void convertIntToString(String input) {
        ToIntFunction<String> strToInt = Integer::parseInt;
        System.out.println("input String = " + input
                                   + " result Integer = " + strToInt.applyAsInt(input));
    }

    private static void listContains(List<String> list, String key) {
        BiPredicate<List<String>, String> contains = List::contains;
        System.out.println(String.format("Contains = %s in %s ? ", key, Arrays.toString(list.toArray())) + contains.test(list,
                key));
    }

    private static void sumHugeNumbers(Long long1, Long long2) {
        ToLongBiFunction<Long, Long> addLongs = Math::addExact;
        System.out.println(String.format("Sum %d and %d is equal to %d",
                long1, long2, addLongs.applyAsLong(long1, long2)));
    }

//    private boolean isStartWithNumber(String input) {
//        Predicate<String> stringPredicate = this::isStartWithNumber;
//    }
}
