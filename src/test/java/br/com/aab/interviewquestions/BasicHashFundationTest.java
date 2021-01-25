package br.com.aab.interviewquestions;

import br.com.aab.interviewquestions.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BasicHashFundationTest {

    BasicHashFundation basicHashFundation;

    @Test
    public void testExecHashSetAdd() {
        Person[] persons = new Person[3];
        persons[0] = new Person(1, "Joao");
        persons[1] = new Person(2, "Maria");
        persons[2] = new Person(3, "Jose");

        basicHashFundation = new BasicHashFundation(persons);
        HashSet<Person> hashSet = basicHashFundation.execHashSetAdd();

        assertThat(hashSet).isNotEmpty();
        assertThat(hashSet).hasSize(3);
        assertThat(hashSet).extracting(Person::getName).containsExactlyInAnyOrder("Jose", "Joao", "Maria");
    }

    @Test
    public void testExecHashMapAdd() {
        Person[] persons = new Person[3];
        persons[0] = new Person(1, "Joao");
        persons[1] = new Person(2, "Maria");
        persons[2] = new Person(3, "Jose");

        basicHashFundation = new BasicHashFundation(persons);
        HashMap<Integer, Person> hashMap = basicHashFundation.execHashMapPut();

        assertThat(hashMap).isNotEmpty();
    }
}