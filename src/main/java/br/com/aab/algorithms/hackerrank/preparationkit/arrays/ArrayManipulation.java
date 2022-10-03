package br.com.aab.algorithms.hackerrank.preparationkit.arrays;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayManipulation {

//    public static void main(String[] args) {
//        int n = 10; int[][] queries = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};               // R = 10
////        int n = 5; int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};          // R = 200
////        int n = 10; int[][] queries = {{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}};   // R = 31
//        System.out.println("R = " + arrayManipulation(n, queries));
//    }

    // Queries = [[1,5,3],[4,8,7],[6,9,1]] and n = 10

    //First step  [1,5,3],[6,10,0]
    //Second step [1,3,3],[4,5,10],[6,8,7],[9,10,0]
    //Third step  [1,3,3],[4,5,10],[6,8,8],[9,9,1],[10,10,0]

//    final Comparator<QueriesArraysManipulation> COMPARATOR =
//            Comparator.comparingInt((QueriesArraysManipulation qam) -> qam.a)
//            .thenComparing(qa -> qa.b);

//    static final Comparator<QueriesArraysManipulation> COMPARATOR_QAM_HASH_CODE =
//            Comparator.comparingInt(o -> o.hashCode());

    static long arrayManipulation(int n, int[][] queries) {
        //List<QueriesArraysManipulation> list = buildArraysManipulation(queries);
        int m = queries.length;
        long finalResult = 0;
        long[] mainElements = new long[n+1];
        while (m-- >0) {
            int a = queries[m][0];
            int b = queries[m][1];
            long k = queries[m][2];
            mainElements[a-1] += k;
            mainElements[b] -= k;
        }
        long sum = 0;
        for (int x = 0; x < n; x++) {
            sum += mainElements[x];
            finalResult = Math.max(finalResult, sum);
        }
        return finalResult;
    }

//    public int compareTo(QueriesArraysManipulation qam) {
//        return COMPARATOR.compare(this, qam);
//    }

//    static List<QueriesArraysManipulation> buildArraysManipulation(int[][] queries) {
//        List<QueriesArraysManipulation> arraysManipulationsList = new ArrayList<>();
//        for (int i = 0; i < queries.length; i++) {
//            arraysManipulationsList.add(new QueriesArraysManipulation(queries[i][0], queries[i][1],
//                    (long) queries[i][2]) );
//        }
//        Collections.sort(arraysManipulationsList);
//        return arraysManipulationsList;
//    }

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

    public static void main(String[] args) throws IOException {
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