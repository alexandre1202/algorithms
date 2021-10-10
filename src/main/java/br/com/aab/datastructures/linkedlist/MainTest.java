package br.com.aab.datastructures.linkedlist;

public class MainTest {

  public static void main(String[] args) {
    List<Customer> list = new LinkedList<Customer>();

    Customer customer1 = new Customer(29, "Paulo");
    Customer customer2 = new Customer(17, "Lully");
    Customer customer3 = new Customer(45, "Francisco");
    Customer customer4 = new Customer(30, "Gaby");
    Customer customer5 = new Customer(60, "Andre");
    Customer customer6 = new Customer(20, "Pietro");
    Customer customer7 = new Customer(1, "Ryan");

    list.insert(customer1);
    list.insert(customer2);
    list.insert(customer3);
    list.insert(customer4);
    list.insert(customer5);
    list.insert(customer6);
    list.insert(customer7);

    list.traverseList();

    Node<Customer> middleNode = list.getMiddleNode();
    System.out.println("middleNode = " + middleNode.getData());


    List<Integer> integers = new LinkedList<>();
    integers.insert(10);
    integers.insert(2);
    integers.insert(13);
    integers.insert(5);

    System.out.println("----- Before -----");
    integers.traverseList();
    integers.reverse();
    System.out.println("\n----- After -----");
    integers.traverseList();
  }

}
