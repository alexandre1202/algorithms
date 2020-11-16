package br.com.aab.codingproblems.s013;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemovingOneCharacterTest {

    private RemovingOneCharacter removingOneCharacter;

    @Before
    public void setUp() throws Exception {
        removingOneCharacter = new RemovingOneCharacter();
    }

    @Test
    public void testRemovingOneCharacterFrom() {
        String words = "Alexandre Antonio Barbosa";
        String expected = "Aleandre Antonio Barbosa";
        String result = removingOneCharacter.removingOneCharacterUsingReplaceAll(words, 'x');
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testRemovingOneCharacterUsingFS() {
        String words = "Alexandre Antonio Barbosa";
        String expected = "Aleandre Antonio Barbosa";
        String result = removingOneCharacter.removingOneCharacterUsingFS(words, 'x');
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testRemovingOneCharacterUsingCodePoints() {
        String words = "Alexandre Antonio Barbosa";
        String expected = "Aleandre Antonio Barbosa";
        String result = removingOneCharacter.removingOneCharacterUsingCodePoints(words, 'x');
        assertThat(result).isEqualTo(expected);
    }

}