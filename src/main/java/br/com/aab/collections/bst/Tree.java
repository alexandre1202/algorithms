package br.com.aab.collections.bst;

public interface Tree<T extends Comparable<T>> {
    void traversal();
    void insert(T data);
    T delete(T data);
    T getMinValue();
    T getMaxValue();
}
