package br.com.aab.datastructures.doublelinkedlist;

public class MainTest {
   public static void main(String[] args) {
      DoublyLinkedList<String> names = new DoublyLinkedList<>();
      names.insert("Adam");
      names.insert("Kevin");
      names.insert("Ana");
      names.insert("Daniel");
      names.insert("Jane Doe");
      names.insert("Curt Weller");
      names.insert("Zapata");


      System.out.println("---- Traverse Forward ----");
      names.traverseFoward();
      System.out.println("---- Traverse Backward ----");
      names.traverseBackward();
      System.out.println("---- Middle Node ----");
      System.out.println("names.getMiddleNode() = " + names.getMiddleNode());
      names.reverseOrder();
      System.out.println("---- Reversed Order ----");
      names.traverseFoward();
   }
}
