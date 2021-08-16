package br.com.aab.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MyConsumerExample {
    public static void main(String[] args) {
//        consumerSystemPrintLn();
        consumerCombiningTwoConsumerLists();
//        consumerMultiplyNumbers();
    }

    private static void consumerMultiplyNumbers() {
        List<Integer> integers = Arrays.asList(3, 5, 7, 2, 4, 6, 8);
        Consumer<List<Integer>> multiply = list -> {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i) * 2);
            }
        };
        multiply.accept(integers);
    }

    private static void consumerCombiningTwoConsumerLists() {
        Consumer<List<Integer>> modify = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, 2 * list.get(i));
            }
        };
        Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>() {{
           add(2);
           add(1);
           add(3);
        }};

        modify.accept(list);
        dispList.accept(list);
    }

    private static void consumerSystemPrintLn() {
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);
    }
}
