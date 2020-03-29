package br.com.aab.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TheListInteger {
    public int getSmallestMissingNumber(int[] intArray) {
        int result = 0;
        List<Integer> integerList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        Collections.sort(integerList);
        for (int i = 0; i < integerList.size(); i++) {
            if (i == integerList.size()-1 ) return i+2;
            if ( integerList.get(i) != integerList.get(i+1)
                    && integerList.get(i)+1 != integerList.get(i+1) ) {
                return integerList.get(i)+1 < 0 ? 1 : integerList.get(i)+1;
            }
        }
        return result;
    }

    public int sumNumbers(int[] numbers) {
        return Arrays.stream(numbers).boxed().collect(Collectors.toList()).stream().reduce(0, Integer::sum);
    }

    public int maxNumberInArray(int[] numbers) {
        List<Integer> integerList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        return integerList.stream().reduce(Integer::max).get();
    }

    public int minNumberInArray(int[] numbers) {
        List<Integer> integerList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        return integerList.stream().reduce(Integer::min).get();
    }
}
