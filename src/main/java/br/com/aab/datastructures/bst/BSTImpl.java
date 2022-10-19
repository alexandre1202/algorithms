package br.com.aab.datastructures.bst;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class BSTImpl<T extends Comparable<T>> implements BST<T> {

    private Node<T> root;

    @Override
    public Node<T> getRoot() {
        return this.root;
    }

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
            if (nonNull(node.getLeftChild()))
                insert(data, node.getLeftChild());
            else
                node.setLeftChild(new Node<>(data, node));
        } else if (data.compareTo(node.getData()) > 0) {
            if (nonNull(node.getRightChild()))
                insert(data, node.getRightChild());
            else
                node.setRightChild(new Node<>(data, node));
        }
    }

    @Override
    public void remove(T data) {
        if (isNull(data) || isNull(root)) return;

        remove(data, root);
    }

    private void remove(T data, Node<T> node) {
        if (data.compareTo(node.getData()) < 0)
            remove(data, node.getLeftChild());
        else if (data.compareTo(node.getData()) > 0)
            remove(data, node.getRightChild());
        else {
            final Node<T> parent = node.getParent();

            if (isNull(node.getLeftChild()) && isNull(node.getRightChild())) {
                if (isNull(parent)) {
                    root = null;
                } else {
                    if (parent.getLeftChild() == node) {
                        parent.setLeftChild(null);
                    } else if (parent.getRightChild() == node) {
                        parent.setRightChild(null);
                    }
                    node = null;
                }

            //RightChild not null
            } else if (isNull(node.getLeftChild()) && nonNull(node.getRightChild())) {
                if (isNull(parent)) {
                    root = node.getRightChild();
                } else {
                    if (parent.getLeftChild() == node)
                        parent.setLeftChild(node.getRightChild());
                    else if(parent.getRightChild() == node)
                        parent.setRightChild(node.getRightChild());
                    node.getRightChild().setParent(parent);
                }

            //LeftChild not null
            } else if (nonNull(node.getLeftChild()) && isNull(node.getRightChild())) {
                if (isNull(parent)) {
                    root = node.getLeftChild();
                } else {
                    if (parent.getLeftChild() == node)
                        parent.setLeftChild(node.getLeftChild());
                    else if(parent.getRightChild() == node)
                        parent.setRightChild(node.getLeftChild());
                    node.getLeftChild().setParent(parent);
                }

            // Mathematical Reduction - finding the predecessor
            } else {
                Node<T> predecessor = getPredecessor(node.getLeftChild());
                T temporary = predecessor.getData();
                predecessor.setData(node.getData());
                node.setData(temporary);
                remove(data, predecessor);
            }
        }
    }

    private Node<T> getPredecessor(Node<T> node) {
        if (nonNull(node.getRightChild()))
            return getPredecessor(node.getRightChild());
        return node;
    }

    @Override
    public void traversal() {
        if (isNull(root)) return;
        traversal(root);
    }

    private void traversal(Node<T> node) {
        if (nonNull(node.getLeftChild()))
            traversal(node.getLeftChild());

        System.out.print(node + " < ");

        if (nonNull(node.getRightChild()))
            traversal(node.getRightChild());
    }

    @Override
    public T getMin() {
        if (isNull(root)) return null;
        return getMin(root.getLeftChild());
    }

    private T getMin(Node<T> node) {
        if (nonNull(node.getLeftChild()))
            return getMin(node.getLeftChild());
        return node.getData();
    }

    @Override
    public T getMax() {
        if (isNull(root)) return null;
        return getMax(root);
    }

    private T getMax(Node<T> node) {
        if (nonNull(node.getRightChild()))
            return getMax(node.getRightChild());
        return node.getData();
    }
}
