package br.com.aab.algorithms;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class IntegerInverterTest {

    @Test
    public void test123() {
        Integer expected = 321;
        Integer actual = 123;
        Assertions.assertEquals(expected, IntegerInverter.inverter(actual).intValue());
    }
}