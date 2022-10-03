package br.com.aab.lambda.foo;

public class Trash {
    public static void main(String[] args) {
        System.out.println("reverseOrder = " + reverseOrder(54321));
    }

    public static Number reverseOrder(Integer numberToBeInverted) {
        long result = 0;
        while (numberToBeInverted != 0) {
            result = result *10 + (numberToBeInverted % 10);
            numberToBeInverted /= 10;
        }
        return result;
    }
}
