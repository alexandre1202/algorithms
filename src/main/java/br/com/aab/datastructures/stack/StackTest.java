package br.com.aab.datastructures.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Alexandre");
        stack.push("Antonio");
        stack.push("Barbosa");
        stack.push("Gabriela");

        stack.traverse();
        System.out.println("pop() = " + stack.pop());
        stack.traverse();
        System.out.println("pop() = " + stack.pop());
        stack.traverse();
        System.out.println("pop() = " + stack.pop());
        stack.traverse();
        System.out.println("pop() = " + stack.pop());
        stack.traverse();
    }
}
