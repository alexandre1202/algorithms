package br.com.aab.codingproblems.s020;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CharConcatenateTest {

    private CharConcatenate charConcatenate;

    @Before
    public void setUp() throws Exception {
        charConcatenate = new CharConcatenate();
    }

    @Test
    public void testConcatenateV1() {
        int occurences = 10;
        Character character = 'X';
        String result = charConcatenate.buildStringV1(character, occurences);
        assertThat(result).isEqualTo("XXXXXXXXXX");
        assertThat(result).doesNotContain("YYYYYYYYYY");
    }

    @Test
    public void testConcatenateV2() {
        int occurences = 10;
        Character character = 'X';
        String result = charConcatenate.buildStringV2(character, occurences);
        assertThat(result).isEqualTo("XXXXXXXXXX");
        assertThat(result).doesNotContain("YYYYYYYYYY");
    }

}