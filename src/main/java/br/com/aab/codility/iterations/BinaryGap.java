package br.com.aab.codility.iterations;

public class BinaryGap {

    //https://app.codility.com/programmers/lessons/1-iterations/binary_gap/start/

    public int solutions(int N) {
        if (N <= 0 || N > Integer.MAX_VALUE) return 0;
        final String binaryNumber = Integer.toBinaryString(N);
        if (binaryNumber.length() < 3) return 0;

        int countGap = 0;
        int maxGap = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (i > 0 && binaryNumber.charAt(i) == '0') {
                countGap++;
            } else {
                maxGap = countGap > maxGap ? countGap : maxGap;
                countGap = 0;
            }
        }
        return maxGap;
    }

    // Passed 80%
    // Wrong 20%, as following:
    // n=1, n=5=101_2 and n=2147483647=2**31-1
    // n=5=101_2, n=16=2**4 and n=1024=2**10
    // n=1162=10010001010_2 and n=5=101_2
}
