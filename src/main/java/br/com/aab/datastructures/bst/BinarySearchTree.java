package br.com.aab.datastructures.bst;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data, null);
        } else {
            insert(data, root);
        }
    }

    private void insert(T data, Node<T> node) {
        if (data.compareTo(node.getData()) < 0) {
            if (node.getLeftChild() != null)
                insert(data, node.getLeftChild());
            else
                node.setLeftChild(new Node<>(data, node));
        } else {
            if (node.getRightChild() != null)
                insert(data, node.getRightChild());
            else
                node.setRightChild(new Node<>(data, node));
        }
    }

    @Override
    public void remove(T data) {
        if (nonNull(root) || nonNull(data))
            removeValue(data, root);
    }

    private void removeValue(T data, Node<T> node) {
        if (data.compareTo(node.getData()) < 0) {
            removeValue(data, node.getLeftChild());
        } else if (data.compareTo(node.getData()) > 0) {
            removeValue(data, node.getRightChild());
        } else {
            // We found the value to be removed!

            // In case of leaf node (without children)
            final Node<T> parent = node.getParent();
            if (isNull(node.getLeftChild()) && isNull(node.getRightChild())) {

                //Verify if it is a left leaf or right leaf
                if (nonNull(parent)) {
                    if (node.getLeftChild() == node) {
                        node.setLeftChild(null);
                    } else if (node.getRightChild() == node) {
                        node.setRightChild(null);
                    }
                } else {
                    root = null;
                }

                // In case of a single node Left or Right
            } else if(isNull(node.getLeftChild()) && nonNull(node.getRightChild())) {
                if (nonNull(parent)) {
                    if (parent.getLeftChild() == node) {
                        parent.setLeftChild(node.getRightChild());
                    } else if(parent.getRightChild() == node) {
                        parent.setRightChild(node.getRightChild());
                    }
                } else {
                    root = node.getRightChild();
                }
                node.getRightChild().setParent(parent);
            } else if(isNull(node.getRightChild()) && nonNull(node.getLeftChild())) {
                if (nonNull(parent)) {
                    if (parent.getLeftChild() == node) {
                        parent.setLeftChild(node.getLeftChild());
                    } else if(parent.getRightChild() == node) {
                        parent.setRightChild(node.getLeftChild());
                    }
                } else {
                    root = node.getLeftChild();
                }
                node.getLeftChild().setParent(parent);
            } else {

            }
        }
    }

    @Override
    public void traversal() {
        if (root == null) return;

        traversal(root);
    }

    public void traversal(Node<T> node) {
        if (node.getLeftChild() != null)
            traversal(node.getLeftChild());

        System.out.print(node + " < ");

        if (node.getRightChild() != null)
            traversal(node.getRightChild());
    }

    @Override
    public T getMin() {
        if (root == null) return null;

        return getMin(root);
    }

    private T getMin(Node<T> node) {
        if (node.getLeftChild() != null)
            return getMin(node.getLeftChild());
        return node.getData();
    }

    @Override
    public T getMax() {
        if (root == null) return null;
        return getMax(root);
    }

    private T getMax(Node<T> node) {
        if (node.getRightChild() != null)
            getMax(node.getRightChild());

        return node.getData();
    }
}
