package br.com.aab.algorithms.thinkingdatastructure.doublylinkedlists;

public class EmployeeDoublyLinkedList {

  private EmployeeNode head;
  private EmployeeNode tail;
  private int size;

  public boolean addBefore(Employee empToAdd, Employee empExisted) {
    if (head == null) return false;
    EmployeeNode currentNode = head;
    while (currentNode != null && !currentNode.getEmployee().equals(empExisted)) {
      currentNode = currentNode.getNext();
    }
    if (currentNode == null) return false;

    EmployeeNode newNode = new EmployeeNode(empToAdd);
    newNode.setPrevious(currentNode.getPrevious());
    newNode.setNext(currentNode);

    currentNode.setPrevious(newNode);

    if (head == currentNode) {
      head = newNode;
    } else {
      newNode.getPrevious().setNext(newNode);
    }
    size++;

    return true;
  }
  public void addToFront(Employee employee) {
    EmployeeNode node = new EmployeeNode(employee);

    if (head == null) {
      tail = node;
    }
    else {
      head.setPrevious(node);
      node.setNext(head);
    }

    head = node;
    size++;
  }

  public void addToEnd(Employee employee) {
    EmployeeNode node = new EmployeeNode(employee);
    if (tail == null) {
      head = node;
    }
    else {
      tail.setNext(node);
      node.setPrevious(tail);
    }

    tail = node;
    size++;
  }

  public EmployeeNode removeFromFront() {
    if (isEmpty()) {
      return null;
    }

    EmployeeNode removedNode = head;

    if (head.getNext() == null) {
      tail = null;
    }
    else {
      head.getNext().setPrevious(null);
    }

    head = head.getNext();
    size--;
    removedNode.setNext(null);
    return removedNode;
  }

  public EmployeeNode removeFromEnd() {
    if (isEmpty()) {
      return null;
    }

    EmployeeNode removedNode = tail;

    if (tail.getPrevious() == null) {
      head = null;
    }
    else {
      tail.getPrevious().setNext(null);
    }

    tail = tail.getPrevious();
    size--;
    removedNode.setPrevious(null);
    return removedNode;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void printList() {
    EmployeeNode current = head;
    System.out.print("HEAD -> ");
    while (current != null) {
      System.out.print(current);
      System.out.print(" <=> ");
      current = current.getNext();
    }
    System.out.println("null");
  }


}
