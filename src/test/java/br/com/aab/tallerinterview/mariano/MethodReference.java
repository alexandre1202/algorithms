package br.com.aab.tallerinterview.mariano;

interface Sayable {
    void hello();
}

public class MethodReference {
    public static void saySomething() {
        System.out.println("Hello say Something");
    }

    public static void say() {
        System.out.println("Hi say");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReference::say;
        sayable.hello();
    }
}
