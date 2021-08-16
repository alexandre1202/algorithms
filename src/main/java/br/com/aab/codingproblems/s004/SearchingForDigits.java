package br.com.aab.codingproblems.s004;

public class SearchingForDigits {

    public static boolean containAnyDigits(String param) {
        return !param.chars().anyMatch(d -> !Character.isDigit(d));
    }

    public static boolean containOnlyDigits(String param) {
        return param.matches("[0-9]+");
    }

    public static boolean containOnlyAlphaNumeric(String param) {
        return param.matches("[a-zA-Z_0-9]+");
    }

    public static boolean containOnlyNotAlphaNumeric(String params) {
        return params.matches("[^\\w]+");
    }

    public static boolean dontContainWhiteSpace(String params) {
        return params.matches("\\S");
    }
}