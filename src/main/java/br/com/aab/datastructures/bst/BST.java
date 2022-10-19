package br.com.aab.datastructures.bst;

public interface BST<T> {
    Node<T> getRoot();
    void insert(T data);
    void remove(T data);
    void traversal();
    T getMin();
    T getMax();
}
