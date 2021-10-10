package br.com.aab.datastructures.linkedlist;

public interface List<T extends Comparable<T>> {
  Node<T> getMiddleNode();
  void insert(T data);
  void remove(T data);
  void traverseList();
  int size();
  void reverse();
}
