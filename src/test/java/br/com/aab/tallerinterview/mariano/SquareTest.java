package br.com.aab.tallerinterview.mariano;

interface Square {
    int calculate(int x);
//    default int add(int x, int y) {
//        return x + y;
//    }
}

public class SquareTest {
    public static void main(String[] args) {
        int a = 5;
        Square s = (int x) -> x * x;
        int ans = s.calculate(a);
        System.out.println("ans = " + ans);
    }
}
