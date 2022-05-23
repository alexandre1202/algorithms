package br.com.aab.codility.iterations;

public class BinaryGap {

    //https://app.codility.com/programmers/lessons/1-iterations/binary_gap/start/

    public int solutions(int N) {
        if (N < 1 || N > Integer.MAX_VALUE) return 0;

        String strBinaryInteger = Integer.toBinaryString(N);
        int lenBinaryInteger = strBinaryInteger.length();
        int count = 0;
        int gaps = 0;
        for (int i = 0; i < lenBinaryInteger; i++) {
            if (strBinaryInteger.substring(i, i+1).equals("0")) {
                count++;
            } else {
                if (i > 0 && i != lenBinaryInteger) {
                    gaps = count > gaps ? count : gaps;
                    count = 0;
                }
            }
        }
        return gaps;
    }

}
