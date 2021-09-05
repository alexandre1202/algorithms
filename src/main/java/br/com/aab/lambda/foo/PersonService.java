package br.com.aab.lambda.foo;

import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    private List<Person> persons;

    public PersonService() {
        persons = PersonMother.buildListPerson();
    }

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> findPersonByName(final String name) {
        return persons.stream().filter(p -> p.getName().contains(name)).collect(Collectors.toList());
    }

    public List<Address> findAddressByPersonName(final String name) {
        return null;
    }

    public List<Integer> ages() {
        return null;
    }
}
