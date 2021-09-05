package br.com.aab.lambda.foo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class PersonMother {
    private PersonMother() {}

    static List<Person> buildListPerson() {
        Address addressBusiness = Address.builder()
                .id(generateUUID())
                .address("Collins Avenue, 2875, Miami, FL, US")
                .addressType(Address.AddressType.BUSINESS)
                .build();
        Address addressHome = Address.builder()
                .id(generateUUID())
                .address("Palmeto, 7442, Boca Raton, FL, US")
                .addressType(Address.AddressType.HOME)
                .build();
        Person weller = Person.builder()
                .id(generateUUID()).name("Weller")
                .birth(LocalDate.of(1999, 3, 10))
                .address(Arrays.asList(addressHome, addressBusiness))
                .build();
        Person wellerBlindSpot = Person.builder()
                .id(generateUUID()).name("Weller BlindSpot")
                .birth(LocalDate.of(1999, 3, 10))
                .address(Arrays.asList(addressHome, addressBusiness))
                .build();
        Person jane = Person.builder()
                .id(generateUUID()).name("Jane")
                .birth(LocalDate.of(1999, 8, 1))
                .address(Arrays.asList(addressHome))
                .build();
        Person janeBlindSpot = Person.builder()
                .id(generateUUID()).name("Jane BlindSpot")
                .birth(LocalDate.of(1999, 8, 1))
                .address(Arrays.asList(addressHome))
                .build();
        Person zapata = Person.builder()
                .id(generateUUID()).name("Jane")
                .birth(LocalDate.of(2005, 4, 7))
                .address(Arrays.asList(addressBusiness))
                .build();
        Person ed = Person.builder()
                .id(generateUUID())
                .name("Ed")
                .birth(LocalDate.of(1998, 10, 1))
                .address(Arrays.asList(addressBusiness, addressHome))
                .build();
        Person petterson = Person.builder()
                .id(generateUUID())
                .name("Petterson")
                .birth(LocalDate.of(2009, 2, 20))
                .address(Arrays.asList())
                .build();

        return Arrays.asList(weller, wellerBlindSpot, jane, janeBlindSpot, zapata, ed, petterson);
    }

    private static String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
