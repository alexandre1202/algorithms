package br.com.aab.codingproblems.s046;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndDataStructure {
    public static void main(String[] args) {
        HashCodeAndDataStructure hashCodeAndDataStructure = new HashCodeAndDataStructure();
        hashCodeAndDataStructure.exec1();
    }

    private void exec1() {
        Set<Person> personSet = new HashSet<Person>() {{
            add(new Person(30, "Alexandre"));
            add(new Person(30, "Alexandre"));
        }};
        System.out.println("personSet.size() = " + personSet.size());
        System.out.println("personSet.contains() = " + personSet.contains(new Person(30, "Alexandre")));

        Person person1 = new Person(30, "Alexandre");
        Person person2 = new Person(30, "Alexandre");

        System.out.println("person1.hashCode() = " + person1.hashCode());
        System.out.println("person1 = " + person1);

        System.out.println("person2.hashCode() = " + person2.hashCode());
        System.out.println("person12 = " + person2);

    }
}
