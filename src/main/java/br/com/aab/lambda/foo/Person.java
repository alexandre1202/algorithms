package br.com.aab.lambda.foo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class Person {
    private final String id;
    private final String name;
    private final LocalDate birth;
    private final List<Address> address;
}