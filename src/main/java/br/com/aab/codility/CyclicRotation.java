package br.com.aab.codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {

    public int[] solutions(int[] A, int K) {
        List<Integer> integerList = Arrays.stream(A).boxed().collect(Collectors.toList());
        Collections.rotate(integerList, K);
        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
