package br.com.aab.collections;

import br.com.aab.interviewquestions.model.Person;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ThinkingDSLinkedListTest {

  private ThinkingDSLinkedList linkedList = new ThinkingDSLinkedList();

  @Test
  public void testAddPersonFirstWithSuccess() {
    linkedList.addPersonFirst(new Person(1, "João"));
    linkedList.addPersonLast(new Person(2, "Maria"));
    linkedList.addPersonFirst(new Person(3, "Pedro"));
    linkedList.addPersonLast(new Person(4, "Ana"));
    linkedList.printLinkedListPerson();
    Assertions.assertThat(linkedList).isNotNull();
  }
}