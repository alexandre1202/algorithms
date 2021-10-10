package br.com.aab.datastructures.dijkstra;

import java.util.Stack;

public class StackCalculator {
    private Stack<String> operation;
    private Stack<Double> value;

    public StackCalculator() {
        this.operation = new Stack<>();
        this.value = new Stack<>();
    }

    public void parseExpression(String expression) {
        String[] expressions = expression.split(" ");
        for (String exp : expressions) {
            if ("(".contains(exp)) {

            } else if ("+*".contains(exp)) {
                operation.push(exp);
            } else if (")".equals(exp)) {
                String strOperation = operation.pop();
                if ("+".equals(strOperation)) {
                    value.push(value.pop() + value.pop());
                } else if ("*".equals(strOperation)) {
                    value.push(value.pop() * value.pop());
                }
            } else {
                value.push(Double.parseDouble(exp));
            }
        }
    }

    public void showResult() {
        System.out.println(value.pop());
    }
}
