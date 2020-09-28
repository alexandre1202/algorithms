package br.com.aab.hackerrankprepkit.arrays;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ArrayManipulation {

    public static void main(String[] args) {
        int n = 10; int[][] queries = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};               // R = 10
//        int n = 5; int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};          // R = 200
//        int n = 10; int[][] queries = {{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}};   // R = 31
        System.out.println("R = " + arrayManipulation(n, queries));


    }

    // Queries = [[1,5,3],[4,8,7],[6,9,1]] and n = 10

    //First step  [1,5,3],[6,10,0]
    //Second step [1,3,3],[4,5,10],[6,8,7],[9,10,0]
    //Third step  [1,3,3],[4,5,10],[6,8,8],[9,9,1],[10,10,0]
    static long arrayManipulation(int n, int[][] queries) {
        int queryLength = queries.length;
        long [] arrayAux = new long[n + 1];
        long maxResult = 0;
        long totalResult = 0;

        while (queryLength-- > 0) {
            int a = queries[queryLength][0];
            int b = queries[queryLength][1];
            int k = queries[queryLength][2];
            arrayAux[a-1] += k;
            arrayAux[b] -= k;
        }
        for (int i = 0; i < n; i++) {
            totalResult += arrayAux[i];
            maxResult = Math.max(maxResult, totalResult);
        }
        return maxResult;
    }


    static List<QueriesArraysManipulation> buildArraysManipulation(int[][] queries) {
        List<QueriesArraysManipulation> arraysManipulationsList = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            arraysManipulationsList.add(new QueriesArraysManipulation(queries[i][0], queries[i][1],
                    (long) queries[i][2]) );
        }
        Collections.sort(arraysManipulationsList);
        return arraysManipulationsList;
    }

    static class QueriesArraysManipulation implements Comparable<QueriesArraysManipulation>{
        int a;
        int b;
        long k;

        public QueriesArraysManipulation(int a, int b, long k) {
            this.a = a;
            this.b = b;
            this.k = k;
        }

        @Override
        public int compareTo(QueriesArraysManipulation o) {
            int result = Integer.compare(this.a, o.a);
            if (result == 0) {
                result = Integer.compare(this.b, o.b);
            }
            return result;
        }
    }

    public static void main2(String[] args) throws IOException {
        //R = 7.542.539.201
        //W = 2.147.483.639

        int n = 4000;
        int m = 30000;
        int[][] queries = new int[m][3];
        String arrayManipulationMassTest = "/Users/alexandre1202/Documents/dev/workspace2/algorithms/src/main" +
                                                   "/resources/array-manipulation-teste-case-4.txt";
        BufferedReader bufferedReader =
                new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(arrayManipulationMassTest), "utf-8"));

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = bufferedReader.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println("result = " + result);
    }
}