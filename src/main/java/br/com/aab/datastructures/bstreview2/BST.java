package br.com.aab.datastructures.bstreview2;

public interface BST<T> {
    void insert(T data);
    void traversal();
    void remove(T data);
    T getMin();
    T getMax();
}
