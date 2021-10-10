package br.com.aab.datastructures.dijkstra;

public class StackCalculatorTest {

    public static void main(String[] args) {
        StackCalculator stackCalculator = new StackCalculator();
        stackCalculator.parseExpression("( ( 1 + 2 ) * ( 2 + 1 ) )");
        stackCalculator.showResult();
    }
}
