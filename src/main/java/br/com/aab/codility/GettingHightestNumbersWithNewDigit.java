package br.com.aab.codility;

import java.util.Set;
import java.util.TreeSet;

public class GettingHightestNumbersWithNewDigit {

    public static void main(String[] args) {
        System.out.println("268 = " + new GettingHightestNumbersWithNewDigit().solutions(268));
        System.out.println("-999 = " + new GettingHightestNumbersWithNewDigit().solutions(-999));
        System.out.println("0 = " + new GettingHightestNumbersWithNewDigit().solutions(0));
        System.out.println("-4 = " + new GettingHightestNumbersWithNewDigit().solutions(-4));

    }

    public int solutions(int N) {
        int digit = 5;
        int number = Math.abs(N);
        Set<Integer> integerSet = new TreeSet<>();
        int strLenght = String.valueOf(number).length();
        for (int i = 0; i <= strLenght; i++) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
            stringBuilder.insert(i, digit);
            integerSet.add(Integer.valueOf(stringBuilder.toString()));
        }

        if (N >= 0) {
            return (int) integerSet.toArray()[integerSet.size()-1];
        } else {
            return (int) integerSet.toArray()[0] * -1;
        }
    }
}
