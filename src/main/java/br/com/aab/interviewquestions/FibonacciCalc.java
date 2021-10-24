package br.com.aab.interviewquestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;

public class FibonacciCalc {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FibonacciCalc().getFibonacciSequenceFor(10)));
    }

    int[] getFibonacciSequenceFor(final int LIMIT) {
        return Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0] + f[1]})
                .limit(LIMIT)
                .map(f -> f[0])
                .collect(Collectors.toList())
                .stream()
                .mapToInt(f -> f)
                .toArray();
    }


















    static public int[] getFibonacciSequenceForX(int n) {
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                   .limit(n)
                   .map(f -> f[0])
                   .collect(toList())
                   .stream()
                   .mapToInt(f -> f)
                   .toArray();
    }
}
