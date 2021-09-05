package br.com.aab.interviewquestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class FindingTheMissingNumberInTheSequence {
    public static void main(String[] args) {
        List<Integer> sequence = Arrays.asList(1,2,3,4,6,7,8,9,10);
        IntSummaryStatistics iss = sequence.stream().mapToInt(Integer::intValue).summaryStatistics();
        long lower = iss.getMin(), highest = iss.getMax(), sum = iss.getSum();
        long result = (lower + highest) * (highest - lower + 1) / 2 - sum;
        System.out.println("result = " + Long.valueOf(result).intValue());
    }
}
