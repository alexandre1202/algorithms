package br.com.aab.interviewquestions;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static br.com.aab.interviewquestions.NumberInverter.numberInverter;

public class NumberInverterTest {

    @Test
    public void testNumber() {
        Assertions.assertThat(321).isEqualTo(numberInverter(123));
        Assertions.assertThat(47932).isEqualTo(numberInverter(23974));
        Assertions.assertThat(754389).isEqualTo(numberInverter(983457));
        Assertions.assertThat(-754389).isEqualTo(numberInverter(-983457));
        Assertions.assertThat(-321).isEqualTo(numberInverter(-123));
        Assertions.assertThat(0).isEqualTo(numberInverter(0));
    }
}