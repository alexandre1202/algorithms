package br.com.aab.datastructures.bstreview;

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
            insert(data, root);
        }
    }

    private void insert(T data, Node<T> node) {
        if (data.compareTo(node.getData()) < 0) {
            if (nonNull(node.getLeftNode())) {
                insert(data, node.getLeftNode());
            } else {
                node.setLeftNode(new Node<>(data, node));
            }
        } else {
            if (nonNull(node.getRightNode())) {
                insert(data, node.getRightNode());
            } else {
                node.setRightNode(new Node<>(data, node));
            }
        }
    }

    @Override
    public void traversal() {
        if (isNull(root)) return;

        traversal(root);
    }

    @Override
    public T getMin() {
        if (isNull(root)) return null;
        return getMinValue(root.getLeftNode());
    }

    private T getMinValue(Node<T> node) {
        if (nonNull(node.getLeftNode()))
            getMinValue(node.getLeftNode());
        return node.getData();
    }

    @Override
    public T getMax() {
        if (isNull(root)) return null;
        return getMaxValue(root.getRightNode());
    }

    private T getMaxValue(Node<T> node) {
        if (nonNull(node.getRightNode()))
            getMaxValue(node.getRightNode());
        return node.getData();
    }

    private void traversal(Node<T> root) {
        if (nonNull(root.getLeftNode()))
            traversal(root.getLeftNode());

        System.out.print(root + " < ");

        if (nonNull(root.getRightNode()))
            traversal(root.getRightNode());
    }

    @Override
    public void remove(T data) {

    }
}
