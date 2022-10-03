package br.com.aab.collections;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joining {

    public static void main(String[] args) {
        final String input = "ALEXANDRE";
        final String result = Arrays.asList(input.split("")).stream().distinct().collect(Collectors.joining());
        System.out.println("result = " + result);
    }
}
