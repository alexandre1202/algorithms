package br.com.aab.collections.bst;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data, null);
        } else {
            insertNode(data, root);
        }
    }

    @Override
    public void traversal() {
        if (root != null) inOrderTraversal(root);
    }

    private void inOrderTraversal(Node<T> rootNode) {
        if (rootNode.getLeftChild() != null)
            inOrderTraversal(rootNode.getLeftChild());
        System.out.print(rootNode + " < ");
        if (rootNode.getRightChild() != null)
            inOrderTraversal(rootNode.getRightChild());
    }

    private void insertNode(T newData, Node<T> node) {
        if (newData.compareTo(node.getData()) < 0) {
            if (node.getLeftChild() != null) {
                insertNode(newData, node.getLeftChild());
            } else {
                node.setLeftChild(new Node<>(newData, node));
            }
        } else {
            if (node.getRightChild() != null) {
                insertNode(newData, node.getRightChild());
            } else {
                node.setRightChild(new Node<T>(newData, node));
            }
        }
    }

    @Override
    public void remove(T data) {
        if (nonNull(root))
            remove(data, root);
    }

    private void remove(T data, Node<T> node) {
        if (data.compareTo(node.getData()) < 0) {
            remove(data, node.getLeftChild());

        } else if (data.compareTo(node.getData()) > 0) {
            remove(data, node.getRightChild());

        } else {
            Node<T> parent = node.getParent();

            //Leaf Node
            if (isNull(node.getLeftChild()) && isNull(node.getRightChild())) {
                if (isNull(parent)) {
                    root = null;
                } else {
                    if (parent.getLeftChild() == node) {
                        parent.setLeftChild(null);
                    } else if (parent.getRightChild() == node) {
                        parent.setRightChild(null);
                    }
                }

            //Single Right child of the Node
            } else if (isNull(node.getLeftChild()) && nonNull(node.getRightChild())) {
                if (isNull(parent)) {
                    root = node.getRightChild();
                } else {
                    if (parent.getLeftChild() == node) {
                        parent.setLeftChild(node.getRightChild());
                    } else if (parent.getRightChild() == node) {
                        parent.setRightChild(node.getRightChild());
                    }
                }
                node.getRightChild().setParent(parent);

            //Single Left child of the Node
            } else if (isNull(node.getRightChild()) && nonNull(node.getLeftChild())) {
                if (isNull(parent)) {
                    root = node.getLeftChild();
                } else {
                    if (parent.getLeftChild() == node) {
                        parent.setLeftChild(node.getLeftChild());
                    } else if (parent.getRightChild() == node) {
                        parent.setRightChild(node.getLeftChild());
                    }
                }
                node.getLeftChild().setParent(parent);

            //Node with two children
            } else {
                Node<T> predecessor = getPredecessor(node.getLeftChild());

                T temp = predecessor.getData();
                predecessor.setData(node.getData());
                node.setData(temp);

                remove(data, predecessor);
            }

            node = null;
        }
    }

    private Node<T> getPredecessor(Node<T> node) {

        if(node.getRightChild() != null)
            return getPredecessor(node.getRightChild());

        return node;
    }

    @Override
    public T getMinValue() {
        if (root == null) return null;
        return getMin(root);
    }

    @Override
    public T getMaxValue() {
        if (root == null) return null;
        return getMax(root);
    }

    @Override
    public Node<T> getRoot() {
        return this.root;
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
