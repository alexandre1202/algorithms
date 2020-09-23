package br.com.aab.collections.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> rootNode;

    @Override
    public void insert(T data) {
        if (rootNode == null) {
            rootNode = new Node<>(data);
        } else {
            insertNode(data, rootNode);
        }
    }

    @Override
    public void traversal() {

    }

    private void insertNode(T newData, Node<T> node) {
        if (newData.compareTo(node.getData()) < 0) {
            if (node.getLeftChild() != null) {
                insertNode(newData, node.getLeftChild());
            } else {
                node.setLeftChild(new Node<>(newData));
            }
        } else {
            if (node.getRightChild() != null) {
                insertNode(newData, node.getRightChild());
            } else {
                node.setRightChild(new Node<T>(newData));
            }
        }
    }

    @Override
    public T delete(T data) {
        return null;
    }

    @Override
    public T getMinValue() {
        if (rootNode == null) return null;
        return getMin(rootNode);
    }

    @Override
    public T getMaxValue() {
        if (rootNode == null) return null;
        return getMax(rootNode);
    }

    private T getMin(Node<T> node) {
        //it is the left as far as possible
        if (node.getLeftChild() != null) {
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }

    private T getMax(Node<T> node) {
        //it is the right as far as possible
        if (node.getRightChild() != null) {
            return getMax(node.getRightChild());
        }
        return node.getData();
    }
}
