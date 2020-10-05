package br.com.aab.codingproblems.s003;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ReversingLettersAndWordsTest {
    private ReversingLettersAndWords reversingLettersAndWords;
    private String params = "a minha frase eh essa";

    @Before
    public void init() {
        reversingLettersAndWords = new ReversingLettersAndWords(this.params);
    }

    @Test
    public void testReversingLettersWithSuccess() {
        assertThat(reversingLettersAndWords.reversingLetters())
                .isEqualTo("asse he esarf ahnim a");
    }

    @Test
    public void testReversingLettersIsNotBlank() {
        assertThat(reversingLettersAndWords.reversingLetters())
                .isNotBlank();
    }

    @Test
    public void testReversingLettersIsNotEmpty() {
        assertThat(reversingLettersAndWords.reversingLetters())
                .isNotEmpty();
    }

    @Test
    public void testReverseWords() {
        //words reverted
        assertThat(reversingLettersAndWords.reverseWords())
                .isEqualTo("essa eh frase minha a");
    }

    @Test
    public void testReverseWordsFunctional() {
        //words and letters inverted
        assertThat(reversingLettersAndWords.reverseWordsFunctional())
                .isEqualTo("aahnimesarfheasse");

    }
}