package br.com.aab.hackerrankprepkit.arrays;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
//        int n = 10; int[][] queries = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};               // R = 10
//        int n = 5; int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};          // R = 200
        int n = 10; int[][] queries = {{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}};   // R = 31
        System.out.println("R = " + arrayManipulation(n, queries));
    }

    static long arrayManipulation(int n, int[][] queries) {
        int result = 0;
        int[] array = new int[n];
        Arrays.fill(array, 0);
        int m = queries.length;

        //***** Erro por não considerar os primeiros elementos no último loop devido ter valores que não estão zerados


        int previewsA = 0;
        int previewsB = 0;
        for (int j = 0; j <= m; j++) {
            int a = queries[j][0];
            int b = queries[j][1];
            int k = queries[j][2];
            if (a > 0 && previewsA == 0) {

            }
            if (previewsB > 0 && previewsB > b) b = previewsB;
            if (a <= b) {
                for (int i = a; i <= b; i++) {
                    array[i-1] += k;
                    if (array[i-1] > result) result = array[i-1];
                }
            }
        }
        return result;
    }

    public static void main2(String[] args) throws IOException {
        //R = 7542539201
        //W = 2147483639

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