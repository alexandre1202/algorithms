package br.com.aab.interviewquestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class FindingTheMissingNumberInTheSequence {
    public static void main(String[] args) {
        List<Integer> sequence = Arrays.asList(1,2,3,4,6,7,8,9,10);
        IntSummaryStatistics iss = sequence.stream().mapToInt(Integer::intValue).summaryStatistics();
        long min = iss.getMin(), max = iss.getMax(), sum = iss.getSum();
        int result = (int) ((min + max) * (max - min +1) / 2 - sum);
        System.out.println("The missing number is = " + result);
    }










//    public static void main(String[] args) {
//        List<Integer> sequence = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10);
//        IntSummaryStatistics iss = sequence.stream().mapToInt(Integer::intValue).summaryStatistics();
//        long firstNumber = iss.getMin(), lastNumber = iss.getMax(), sum = iss.getSum();
//        int result = (int) ((firstNumber + lastNumber) * (lastNumber - firstNumber + 1) / 2 - sum);
//        System.out.println("the Missing number is = " + result);
//    }
}
