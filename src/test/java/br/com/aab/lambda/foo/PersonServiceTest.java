package br.com.aab.lambda.foo;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonServiceTest {

    private
    PersonService service = new PersonService();

    @Test
    public void testFindPersonByName() {
        final String name = "Weller";
        List<Person> result = service.findPersonByName(name);
        assertThat(result.size()).isGreaterThanOrEqualTo(1);
        assertThat(result).extracting(Person::getName).contains(name);
    }

    @Test
    public void testFindAddressByPersonName() {
        final String name = "Jane";
        List<String> result = service.findAddressByPersonName(name);
        assertThat(result.size()).isGreaterThanOrEqualTo(1);
    }

    @Test
    public void testFindAdults() {
        List<String> result = service.findAdults();
        assertThat(result.size()).isGreaterThanOrEqualTo(1);
    }

    @Test
    public void testListPersonOrderedByName() {
        List<String> result = service.getNamesAscOrder(Comparator.comparing(Person::getName));
        assertThat(result.get(0)).isEqualTo("Ed");
        assertThat(result.get(1)).isEqualTo("Jane");
        assertThat(result.get(2)).isEqualTo("Jane BlindSpot");
        assertThat(result.get(3)).isEqualTo("Petterson");
        assertThat(result.get(4)).isEqualTo("Weller");
        assertThat(result.get(5)).isEqualTo("Weller BlindSpot");
        result.forEach(System.out::println);
    }

    @Test
    public void testListPersonAscOrderedByBirth() {
        List<String> result = service.getNamesAscOrder(Comparator.comparing(Person::getBirth));
        result.forEach(System.out::println);
    }

    @Test
    public void testListPersonReverseOrderedByBirth() {
        List<String> result = service.getNamesAscOrder(Comparator.comparing(Person::getBirth).reversed());
        result.forEach(System.out::println);
    }

}