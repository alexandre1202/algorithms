package br.com.aab.tallerinterview.mariano;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//interface MyFunctionInterface {
//    int doSomething(int valor);
//}

public class MyFunction {
    public static void main(String[] args) {
//        MyFunctionInterface myFunctionInterface = x -> x * 10;
//        System.out.println(myFunctionInterface.doSomething(2));

        Function<Integer, Double> multiplyBy10 = x -> Math.pow(x, 2);
        System.out.println("args = " + multiplyBy10.apply(10));

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        IntStream.range(0, 5)
                .mapToObj(i -> "dia:" + i)
                .forEach(System.out::println);
    }
}
