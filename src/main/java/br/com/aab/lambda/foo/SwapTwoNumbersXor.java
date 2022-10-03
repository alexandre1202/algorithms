package br.com.aab.lambda.foo;

public class SwapTwoNumbersXor {
    public static void main(String[] args) {
        int num1 = 5; // 0101
        int num2 = 10; // 1010
        System.out.println("Before swapping [" + num1 + "] and [" + num2 + "]");
        num1 = num1 ^ num2;
        System.out.println("First [" + num1 + "] and [" + num2 + "] and Binary num1 = [" + Integer.toBinaryString(num1) + "]");
        num2 = num1 ^ num2;
        System.out.println("Thrid [" + num1 + "] and [" + num2 + "] and Binary num2 = [" + Integer.toBinaryString(num2) + "]");
        num1 = num1 ^ num2;
        System.out.println("Fourth [" + num1 + "] and [" + num2 + "] and Binary num1 = [" + Integer.toBinaryString(num1) + "]");
    }
}
