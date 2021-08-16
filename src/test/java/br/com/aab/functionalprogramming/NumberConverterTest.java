package br.com.aab.functionalprogramming;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class NumberConverterTest {

    private NumberConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new NumberConverter();
    }

    @Test
    public void testDecimalToBinary() {
        String nextGabyBirthday = converter.decimalToBinary(34);
        Assertions.assertThat(nextGabyBirthday).isEqualTo("100010");
    }
}