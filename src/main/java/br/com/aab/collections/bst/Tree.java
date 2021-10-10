package br.com.aab.collections.bst;

public interface Tree<T> {
    void insert(T data);
    void remove(T data);
    void traversal();
    T getMinValue();
    T getMaxValue();
    Node<T> getRoot();
}
