package br.com.aab.interviewquestions;

import br.com.aab.interviewquestions.model.Person;

import java.util.HashMap;
import java.util.HashSet;

public class BasicHashFundation {

    private HashSet<Person> hashSet;
    private HashMap<Integer, Person> hashMap;
    private Person[] persons;

    public BasicHashFundation(Person[] persons) {
        this.persons = persons;
    }

    public HashSet<Person> execHashSetAdd() {
        hashSet = new HashSet<Person>();
        for (int i = 0; i < this.persons.length; i++) {
            this.hashSet.add(new Person(persons[i].getId(), persons[i].getName()));
        }
        return this.hashSet;
    }

    public HashMap<Integer, Person> execHashMapPut() {
        hashMap = new HashMap<Integer, Person>();
        for (int i = 0; i < this.persons.length; i++) {
            this.hashMap.put(i, new Person(persons[i].getId(), persons[i].getName()));
        }
        return this.hashMap;
    }
}
