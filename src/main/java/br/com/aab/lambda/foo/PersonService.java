package br.com.aab.lambda.foo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class PersonService {

    private List<Person> persons;

    public PersonService() {
        persons = PersonMother.buildListPerson();
    }

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> findPersonByName(final String name) {
        return persons.stream()
                .filter(p -> p.getName().contains(name))
                .collect(toList());
    }

    public List<String> findAddressByPersonName(final String name) {
        return persons.stream()
                .filter(p -> p.getName().contains(name))
                .map(p -> p.getAddress())
                .map(adresses -> adresses.stream().map(a -> a.getAddress()).collect(toList()).toString())
                .distinct()
                .collect(toList());
    }

    public List<String> findAdults() {
        return persons.stream()
                .filter(p -> p.getBirth().isAfter(LocalDate.now().minusYears(21)))
                .map(p -> p.getName())
                .distinct()
                .collect(toList());
    }

    public List<String> getNamesAscOrder(Comparator<Person> comparator) {
        return persons.stream()
                .sorted(comparator)
                .map(p -> p.getName()).distinct()
                .collect(toList());
    }
}
