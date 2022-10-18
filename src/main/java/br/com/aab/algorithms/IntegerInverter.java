package br.com.aab.algorithms;

public class IntegerInverter {
    public static Number inverter(Integer input) {
        long result = 0;
        while (input != 0) {
            result = result * 10 + (input % 10);
            input /= 10;
        }
        return result;
    }
}
