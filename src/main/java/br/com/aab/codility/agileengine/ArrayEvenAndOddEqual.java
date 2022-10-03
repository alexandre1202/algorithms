package br.com.aab.codility.agileengine;

public class ArrayEvenAndOddEqual {

    public boolean isPositionEven(int number) {
        return (number % 2) == 0;
    }

    public int greatest(int x, int y) {
        return x >= y ? x : y;
    }


    public int solution1(int[] A) {
        if (A.length == 1) return 1;
        int longestSwitching = 0, initial = 0, even = 0, odd = 0;
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                odd = (i + 1) < A.length ? A[i + 1] : A[i];
                even = A[i];
            }

            boolean isPosEven = isPositionEven(i);
            if ((!isPosEven && odd != A[i]) || (isPosEven && even != A[i])) {
                longestSwitching = greatest(longestSwitching, i - initial);

                even = isPosEven ? A[i] : A[i-1];
                odd = !isPosEven ? A[i-1] : A[i];

                initial = i - 1;
            }
        }

        return greatest(longestSwitching, A.length - initial);
    }

    public static void main(String[] args) {
        ArrayEvenAndOddEqual test = new ArrayEvenAndOddEqual();

        int[] A = {3, 2, 3, 2, 3};
        System.out.println("A result should be 5 = " + test.solution1(A));
        int[] B = {7, 4, -2, 4, -2, -9};
        System.out.println("B result should be 4 = " + test.solution1(B));
        int[] C = {7, -5, -5, -5, 7, -1, 7};
        System.out.println("C result should be 3 = " + test.solution1(C));
        int[] D = {4};
        System.out.println("D result should be 1 = " + test.solution1(D));

    }
}
