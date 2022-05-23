package br.com.aab.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceForSum {
    public Integer calc(final List<Integer> numbers) {
        BinaryOperator<Integer> accumulator = (acc, number) -> acc + number;
        return numbers.stream().reduce(0, accumulator);
    }

    public static void main(String[] args) {
        System.out.println("sum {1, 2, 3} " + new ReduceForSum().calc(Arrays.asList(1, 2, 3)));
    }
}
