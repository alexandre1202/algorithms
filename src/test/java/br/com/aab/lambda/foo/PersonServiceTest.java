package br.com.aab.lambda.foo;

import org.junit.Test;

import java.util.List;

public class PersonServiceTest {

    private
    PersonService service = new PersonService();

    @Test
    public void testFindPersonByName() {
        List<Person> result = service.findPersonByName("Weller");
        result.forEach(System.out::println);
    }
}