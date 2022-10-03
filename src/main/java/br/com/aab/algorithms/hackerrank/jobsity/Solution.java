package br.com.aab.algorithms.hackerrank.jobsity;

import java.util.Arrays;

public class Solution {
    // 1 ) 9 minutos
    public static void main(String[] args) {
        int i = 0;
        int n = 10;
//        for (i = 1; i < n; i *=2) {
//            System.out.println("i = " + i);
//        }

        for (i = n; i > -1; i /=2) {
            System.out.println("i = " + i);
        }
    }
}
