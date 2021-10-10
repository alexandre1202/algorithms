package br.com.aab.datastructures.doublelinkedlist;

public class DoublyLinkedList<T extends Comparable<T>> {

   private Node<T> head;
   private Node<T> tail;

   public void insert(T data) {
      Node<T> newNode = new Node<>(data);

      if (tail == null) {
         tail = newNode;
         head = newNode;
      } else {
         newNode.setPrevious(tail);
         tail.setNext(newNode);
         tail = newNode;
      }
   }

   public void traverseFoward() {
      Node<T> actualNode = head;
      while (actualNode != null) {
         System.out.println(actualNode);
         actualNode = actualNode.getNext();
      }
   }

   public void traverseBackward() {
      Node<T> actualNode = tail;
      while (actualNode != null) {
         System.out.println(actualNode);
         actualNode = actualNode.getPrevious();
      }
   }

   public Node<T> getMiddleNode() {
      Node<T> slowerNode = this.head;
      Node<T> fasterNode = this.head;
      while (fasterNode.getNext() != null && fasterNode.getNext().getNext() != null) {
         slowerNode = slowerNode.getNext();
         fasterNode = fasterNode.getNext().getNext();
      }
      return slowerNode;
   }

   public void reverseOrder() {
      Node<T> currentlNode = head;
      Node<T> previousNode = null;
      Node<T> nextNode = null;
      while (currentlNode != null) {
         nextNode = currentlNode.getNext();
         currentlNode.setNext(previousNode);
         previousNode = currentlNode;
         currentlNode = nextNode;
      }
   }
}
