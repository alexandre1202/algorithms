package br.com.aab.interviewquestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciCalc {

    public static void main(String[] args) {
        int[] sequence = new FibonacciCalc().getFibonacciSequenceFor(10);
        System.out.println("Sequence = "+ Arrays.toString(sequence));
        int sumSequence = new FibonacciCalc().sumSequence(sequence);
        System.out.println("sumSequence = " + sumSequence);
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

    int sumSequence(int[] sequence) {
        return Arrays.stream(sequence).sum();
    }
}
