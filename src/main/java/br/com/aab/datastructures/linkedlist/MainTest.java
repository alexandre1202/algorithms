package br.com.aab.datastructures.linkedlist;

public class MainTest {

  public static void main(String[] args) {
    List<Integer> list = new LinkedList<>();
    list.insert(10);
    list.insert(-2);
    list.insert(3);
    list.insert(100);
    list.traverseList();
  }

}
