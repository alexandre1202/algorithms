package br.com.aab.algorithms.hackerrank.jobsity;

//2) 2 minutos
class X {
    static void staticMethod() {
        System.out.println("Class X");
    }
}

class Y extends X {
    static void staticMethod() {
        System.out.println("Class Y");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Y.staticMethod();
    }
}
