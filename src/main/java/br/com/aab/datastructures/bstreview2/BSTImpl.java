package br.com.aab.datastructures.bstreview2;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class BSTImpl <T extends Comparable<T>> implements BST<T> {
    private Node<T> root;

    @Override
    public void insert(T data) {
        if (isNull(data)) return;
        if (isNull(root)) {
            root = new Node<>(data, null);
        } else {
            insertNode(data, root);
        }
    }

    private void insertNode(T data, Node<T> node) {
        if (data.compareTo(node.getData()) < 0) {
            if (nonNull(node.getLeftNode())) {
                insertNode(data, node.getLeftNode());
            } else {
                node.setLeftNode(new Node<>(data, node.getLeftNode()));
            }
        } else {
            if (nonNull(node.getRightNode())) {
                insertNode(data, node.getRightNode());
            } else {
                node.setRightNode(new Node<>(data, node.getRightNode()));
            }
        }
    }

    @Override
    public void traversal() {
        if (root == null) return;
        traversalNodes(root);
    }

    private void traversalNodes(Node<T> node) {
        if (nonNull(node.getLeftNode()))
            traversalNodes(node.getLeftNode());
        System.out.print(node.getData() + " < ");
        if (nonNull(node.getRightNode()))
            traversalNodes(node.getRightNode());
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public T getMin() {
        if (isNull(root)) return null;
        return getMinValue(root);
    }

    private T getMinValue(Node<T> node) {
        if (nonNull(node.getLeftNode()))
            return getMinValue(node.getLeftNode());
        return node.getData();
    }

    @Override
    public T getMax() {
        if (isNull(root)) return null;
        return getMaxValue(root);
    }

    private T getMaxValue(Node<T> node) {
        if (nonNull(node.getRightNode()))
            return getMaxValue(node.getRightNode());
        return node.getData();
    }
}
