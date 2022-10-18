package br.com.aab.datastructures.bstreview;

public interface BST<T> {
    void insert(T data);
    void remove(T data);
    void traversal();
    T getMin();
    T getMax();
}
