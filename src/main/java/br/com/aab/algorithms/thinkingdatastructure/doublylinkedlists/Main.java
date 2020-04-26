package br.com.aab.algorithms.thinkingdatastructure.doublylinkedlists;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedList<Employee> linkedList = new LinkedList<Employee>();
        linkedList.addFirst(janeJones);
        linkedList.addFirst(johnDoe);
        linkedList.addFirst(marySmith);
        linkedList.addFirst(mikeWilson);

        linkedList.forEach(System.out::println);
//        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
//
//        list.addToFront(janeJones);
//        list.addToFront(johnDoe);
//        list.addToFront(marySmith);
//        list.addToFront(mikeWilson);

//        list.printList();
//        System.out.println(list.getSize());
//
//        Employee billEnd = new Employee("Bill", "End", 78);
//        list.addToEnd(billEnd);
//        list.printList();
//        System.out.println(list.getSize());
//        list.removeFromFront();
//        list.printList();
//        System.out.println(list.getSize());
//        list.removeFromEnd();
//        list.printList();
//        System.out.println(list.getSize());
//
//        list.addBefore(billEnd, johnDoe);
//        list.printList();

    }
}
