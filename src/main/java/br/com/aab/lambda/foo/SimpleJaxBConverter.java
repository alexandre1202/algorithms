package br.com.aab.lambda.foo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleJaxBConverter {

    public static void main(String[] args) {
        SimpleJaxBConverter converter = new SimpleJaxBConverter();
        converter.execute();
    }

    void execute() {
        List<Person> personList = new ArrayList<Person>() {{
            add(new Person(1, "Alexandre"));
            add(new Person(2, "Gabriela"));
        }};
        personList.forEach(p -> {
            System.out.println(p.id + " - " + p.name);
        });
        System.out.println("persons: " + convertDtoToJSON(personList));
    }

    public String convertDtoToJSON(List<Person> persons) {
        final ObjectMapper mapper = new ObjectMapper();

        return persons.stream().map(p -> {
            try {
                return mapper.writeValueAsString(p);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return "{}";
            }
        }).collect(Collectors.joining(","));
    }

    class Person {
        Integer id;
        String name;

        public Person(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
