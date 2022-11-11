package br.com.aab.codility.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {
    // 100% Total score
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
    }

    // 60% Total score
    public int solutions2(int[] A) {
        final List<Integer> input = Arrays.stream(A).boxed().collect(Collectors.toList());
        final Map<Integer, Long> mapInput = input.stream().collect(Collectors.groupingBy(e -> e,
                Collectors.counting()));
        List<Integer> result =
                mapInput.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());
        return Objects.isNull(result) || result.isEmpty() ? 0 : result.get(0);
    }
}
