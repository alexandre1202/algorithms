package br.com.aab.codility;

public class BinaryGap {

    public int solutions(int n) {
        if (n < 1 || n > Integer.MAX_VALUE) return 0;

        String strBinaryInteger = Integer.toBinaryString(n);
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
