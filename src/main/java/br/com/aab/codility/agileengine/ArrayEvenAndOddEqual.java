package br.com.aab.codility.agileengine;

public class ArrayEvenAndOddEqual {

    public int solution1(int[] A) {
        int countSwitching = 0;
        if (A.length == 1) return 1;

        for (int i = 0; i < A.length -1; i++) {
            if (A.length > (i + 2)) {
                if (A[i] == A[i + 2]) {
                    countSwitching += (A.length - 1) == countSwitching ? 1 : 2;
                }
            } else {
                countSwitching = countSwitching + (i == (A.length -1) ? 1 : 0);
            }
        }
        return countSwitching;
    }

    public static void main(String[] args) {
        ArrayEvenAndOddEqual test = new ArrayEvenAndOddEqual();

//        int[] A = {3, 2, 3, 2, 3};
//        System.out.println("A result should be 5 = " + test.solution1(A));
//
//        int[] B = {7, 4, -2, 4, -2, -9};
//        System.out.println("B result should be 4 = " + test.solution1(B));

        int[] C = {7, -5, -5, -5, 7, -1, 7};
        System.out.println("C result should be 3 = " + test.solution1(C));

//        int[] D = {4};
//        System.out.println("D result should be 1 = " + test.solution1(D));

    }
}
