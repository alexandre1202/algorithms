package br.com.aab.codility.arrays;

import java.util.*;
import java.util.Map.Entry;

public class OddOccurrencesInArray {
    public int solutions(int[] A) {
        int[] array = A;
        Arrays.sort(array);

        int oddOcurrence = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                oddOcurrence = array[i-1];
                break;
            } else if (i + 2 >= array.length) {
                oddOcurrence = array[i+1];
                break;
            } else {
                i++;
            }
        }
        return oddOcurrence;

//        int min = Arrays.stream(A).boxed().reduce(Integer::min).get();
//        int max = Arrays.stream(A).boxed().reduce(Integer::max).get();
//        if (min < 1 || max >= 1000000) return 0;

//        List<Integer> oddDistinctedList = Arrays.stream(A).boxed().distinct().collect(Collectors.toList());
//        List<Integer> oddDistinctedList = new ArrayList<Integer>();
//        Map<Integer, Integer> mapOddOccurence = new HashMap<>();
//        for (int item : oddDistinctedList) {
//            mapOddOccurence.put(item, 0);
//        }
//
//        int result = 0;
//        int[] array = A;
//        for (int i = 0; i < array.length; i++) {
//            int value = mapOddOccurence.get(array[i]) + 1;
//            mapOddOccurence.put(array[i], value);
//        }
//
//        //https://javaconceptoftheday.com/java-8-sort-hashmap-by-values/
//        List<Entry<Integer, Integer>> listOfEntry = new LinkedList<>(mapOddOccurence.entrySet());
//        Collections.sort(listOfEntry, new Comparator<Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//        for (Entry<Integer, Integer> entry : listOfEntry) {
//            result = entry.getKey();
//            break;
//        }

//        return result;
    }
}
