package br.com.aab.collections;

import br.com.aab.interviewquestions.model.Person;
import java.util.LinkedList;

public class ThinkingDSLinkedList {

  private LinkedList<Person> personLinkedList = new LinkedList<Person>();

  public void addPersonFirst(Person person) {
    personLinkedList.addFirst(person);
  }

  public void addPersonLast(Person person) { personLinkedList.addLast(person);
  }

  public void printLinkedListPerson() {
    personLinkedList.forEach(
        person -> System.out.println(person.getId() + " " + person.getName()));
  }
}
