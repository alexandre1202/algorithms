package br.com.aab.effective.javaexamples;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.TreeSet;

public class Wordlist {
    public static void main(String[] args) {
        //addStringsToTreeSet();
        testOptional();
    }

    private static void testOptional() {
        Person person = new Person("Jose", LocalDateTime.now());

        boolean condition = false;
        Optional<Person> result = condition ? Optional.of(person) : Optional.empty();

        if (result.isPresent()) {
            System.out.println("Meia boca");
        } else {
            System.out.println("Da pra ser melhor");
        }
    }

    static void addStringsToTreeSet() {
        System.out.println("addStringsToTreeSet()");
        TreeSet<String> treeSet = new TreeSet<>();
        String[] names = {"Gustavo", "Chicao", "Lully", "Alexandre", "Gabriela"};
        System.out.println("String[] names  = " + Arrays.toString(names));
        Collections.addAll(treeSet, names);
        System.out.println("TreeSet<String> = " + treeSet);
    }

    static class Person {
        String name;
        LocalDateTime birthDay;
        public Person(String name, LocalDateTime birthDay) {
            this.name = name;
            this.birthDay = birthDay;
        }
    }


}
