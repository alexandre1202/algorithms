package br.com.aab.datastructures.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private int sizeOfList;

    @Override
    public Node<T> getMiddleNode() {
        Node<T> fastPointer = head;
        Node<T> slowPointer = head;

        while(fastPointer.getNextNode() != null && fastPointer.getNextNode().getNextNode() != null) {
            fastPointer = fastPointer.getNextNode().getNextNode();
            slowPointer = slowPointer.getNextNode();
        }
        return slowPointer;
    }

    @Override
    public void insert(T data) {
        ++this.sizeOfList;

        if (head == null) {
            this.head = new Node<>(data);
        } else {
            insertDataAtBeginning(data);
        }
    }

    //O(1)
    private void insertDataAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(head);
        this.head = newNode;
    }

    //O(N)
    public void insertDataAtEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertDataAtEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        --this.sizeOfList;

        if (this.head.getData().compareTo(data) == 0) {
            this.head = this.head.getNextNode();
        } else {
            remove(data, head, head.getNextNode());
        }
    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
        while(actualNode != null) {
            if (actualNode.getData().compareTo(data) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverseList() {
        if (this.head == null) return;
        Node<T> actualNode = this.head;
        while (actualNode != null) {
            System.out.print(actualNode + " -> ");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }

    @Override
    public void reverse() {
        Node<T> currentNode = this.head;
        Node<T> previousNode = null;
        Node<T> nextNode;
        while(currentNode != null) {
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        this.head = previousNode;
    }
}
