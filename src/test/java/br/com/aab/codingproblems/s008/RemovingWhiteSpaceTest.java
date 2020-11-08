package br.com.aab.codingproblems.s008;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemovingWhiteSpaceTest {

    private RemovingWhiteSpace removingWhiteSpace;

    @Before
    public void init() {
        removingWhiteSpace = new RemovingWhiteSpace();
    }

    @Test
    public void testRemoveWhiteSpaceFromString() {
        String result = removingWhiteSpace.removeWhiteSpaceFromString("essa é uma string cheia de spacos");
        assertThat(result).isEqualTo("essaéumastringcheiadespacos");
    }
}