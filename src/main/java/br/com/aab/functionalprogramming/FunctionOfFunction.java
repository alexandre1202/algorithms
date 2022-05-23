package br.com.aab.functionalprogramming;

public class FunctionOfFunction {

    interface NoArgFunction<R> {
        R apply();
    }

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> () -> "Hello FP World!";

        NoArgFunction<String> greeter = createGreeter.apply();

        System.out.println("greeter.apply() = " + greeter.apply());

        System.out.println("createGreeter.apply() = " + createGreeter.apply());

    }
}
