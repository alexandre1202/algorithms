package br.com.aab.lambda.foo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class Address {
    private final String id;
    private final String address;
    private final AddressType addressType;
    enum AddressType {
        BUSINESS, HOME, PAYMENT
    }
}