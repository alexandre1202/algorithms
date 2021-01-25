package br.com.aab.interviewquestions;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberInverterTest {

    private NumberInverter inverter;

    @Before
    public void setUp() throws Exception {
        inverter = new NumberInverter(123);
    }

    @Test
    public void exec() {
        int result = inverter.exec();
        Assertions.assertThat(result).isEqualTo(321);
    }
}