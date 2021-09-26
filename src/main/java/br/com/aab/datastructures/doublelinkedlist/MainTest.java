package br.com.aab.datastructures.doublelinkedlist;

import java.util.Arrays;

public class MainTest {
   public static void main(String[] args) {
      DoublyLinkedList<String> names = new DoublyLinkedList<>();
      names.insert("Adam");
      names.insert("Kevin");
      names.insert("Ana");
      names.insert("Daniel");

      System.out.println("---- Traverse Forward ----");
      names.traverseFoward();
      System.out.println("---- Traverse Backward ----");
      names.traverseBackward();
   }
}
