package br.com.aab.datastructures.stack;

public class Stack<T extends Comparable<T>> {
    private int size;
    private Node<T> head;

    public void push(T data) {
        if (data == null) return;
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> oldHead = head;
            head = new Node<>(data);
            head.setNextNode(oldHead);
        }
    }

    public void traverse() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNextNode();
        }
    }

    public T pop() {

        if (isEmpty()) return null;

        T item = head.getData();
        head = head.getNextNode();
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
