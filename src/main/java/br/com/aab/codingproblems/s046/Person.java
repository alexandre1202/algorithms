package br.com.aab.codingproblems.s046;

public class Person {
    final int age;
    final String name;

    public Person(final int age, final String name) {
        this.age = age;
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person = (Person) o;
//
//        if (age != person.age) return false;
//        return name != null ? name.equals(person.name) : person.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = age;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        return result;
//    }
}