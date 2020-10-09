package br.com.aab.codingproblems.s004;

public class SearchingForDigits {
    private static String param;

    public SearchingForDigits(String param) {
        this.param = param;
    }

    public static boolean hasDigitV1() {
        return param.chars().anyMatch(d -> Character.isDigit(d));
    }
}
