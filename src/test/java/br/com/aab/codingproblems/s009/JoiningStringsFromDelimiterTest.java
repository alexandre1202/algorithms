package br.com.aab.codingproblems.s009;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class JoiningStringsFromDelimiterTest {

    private JoiningStringsFromDelimiter joiningStringsFromDelimiter;

    @Before
    public void init() {
        joiningStringsFromDelimiter = new JoiningStringsFromDelimiter();
    }

    @Test
    public void testJoiningStringsWith() {
        String delimiter = " ";
        String result = joiningStringsFromDelimiter.joiningStringsWith(delimiter, "Eu", "acho", "que", "as", "possibilidades", "de",
                "crescimento", "são", "muito", "grandes", "nesse", "pais");
        Assertions.assertThat(result).isEqualTo("Eu acho que as possibilidades de crescimento são muito grandes nesse" +
                                                        " pais");
    }
}