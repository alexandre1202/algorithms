package br.com.aab.challenge;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Perfection {

//    public static void main(String[] args) {
//        System.out.println("isPerfect(10);" + isPerfect(5));
//    }

    private static Perfection perf;
    private static int LIMIT = 1000;

    public synchronized static Perfection getPerf() {
        if (perf == null) {
            perf = new Perfection();
        }
        return perf;
    }


//    public static boolean isPerfect(long candidate) {
//        long[] divisors = getDivisors(candidate);
//        long sum = Stream.iterate(0, i -> i++)
//                .limit(divisors.length)
//                .mapToLong(d -> divisors[d])
//                .sum();
//        return sum == candidate;

//        long[] divisors = GetDivisors(candidate);
//        boolean retVal;
//        long[] divisors = GetDivisors(candidate);
//        int sum = 0;
//        for (int d = 0; d < 1000; d++)
//        {
//            sum = sum + divisors[d];
//        }
//        if (sum == candidate)
//            retVal = true;


//        return retVal;
//    }

    private static long[] GetDivisors(long candidate) {
        long[] divisors = new long[1000];
        int d = 0;
        for (long i = 0; i < candidate; i++) {
            long foo = candidate / i;
            if (foo * i == candidate) {
                divisors[d] = i;
                d = d + 1;
            }
        }
        return divisors;
    }

}