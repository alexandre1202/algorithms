package br.com.aab.codingproblems.s012;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemovingDuplicatedCharsTest {

    private RemovingDuplicatedChars removingDuplicatedChars;

    @Before
    public void setUp() throws Exception {
        removingDuplicatedChars = new RemovingDuplicatedChars();
    }

    @Test
    public void testRemovingDuplicatedCharsSB() {
        String actual = "aljjaadahljaahaee";
        String result = removingDuplicatedChars.removingDuplicatedCharsSB(actual);
        assertThat(result).isEqualTo("aljdhe");
    }

    @Test
    public void testRemovingDuplicatedCharsUsingHashSet() {
        String actual = "aljjaadahljaahaee";
        String result = removingDuplicatedChars.removingDuplicatedCharsUsingHashSet(actual);
        assertThat(result).isEqualTo("aljdhe");
    }

    @Test
    public void testRemovingDuplicatedCharsUsingStream() {
        String actual = "aljjaadahljaahaee";
        String result = removingDuplicatedChars.removingDuplicatedCharsUsingStream(actual);
        assertThat(result).isEqualTo("aljdhe");
    }
}