package br.com.aab.codility;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class CodilityDemoTask {

    public int solution(int[] A) {
        final int total = Arrays.stream(A).sum();
        if (total <= 0) return 1;
        int[] sortedDistinctA = IntStream.of(A).boxed().distinct().sorted().mapToInt(Integer::intValue).toArray();

        IntSummaryStatistics iss = Arrays.stream(sortedDistinctA).summaryStatistics();
        long lower = iss.getMin(), higher = iss.getMax(), sum = iss.getSum();
        long result = (lower + higher) * (higher - lower + 1) / 2 - sum;

        if (result == 0) return Long.valueOf(higher).intValue() + 1;
        return Long.valueOf(result).intValue();

    }

    public static void main(String[] args) {
        CodilityDemoTask demo = new CodilityDemoTask();
        int[] A = {-1,  -3};
        int result = demo.solution(A);
        System.out.println(Arrays.toString(A) + "result = " + result);

        int[] B = {1, 2, 3};
        result = demo.solution(B);
        System.out.println(Arrays.toString(B) + "result = " + result);

        int[] C = {1, 3, 6, 4, 1, 2};
        result = demo.solution(C);
        System.out.println(Arrays.toString(C) + "result = " + result);
    }
}
