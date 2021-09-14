package br.com.aab.codingproblems.s026;

public class SumBigNumbers {
    private int int1;
    private int int2;
    private long long1;
    private long long2;
    public SumBigNumbers(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public SumBigNumbers(long long1, long long2) {
        this.long1 = long1;
        this.long2 = long2;
    }

    public int getSumIntegers() {
        int result = 0;
        try {
            result = Math.addExact(int1, int2);
        } catch (ArithmeticException ae) {
            throw new ArithmeticException(String.format("Overflow error has occured due to sum %d and %d", int1, int2));
        }
        return result;
    }

    public long getSumLongs() {
        return Math.addExact(long1, long2);
    }
}
