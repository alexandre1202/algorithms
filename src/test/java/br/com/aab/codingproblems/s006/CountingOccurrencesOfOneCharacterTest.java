package br.com.aab.codingproblems.s006;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CountingOccurrencesOfOneCharacterTest {
    private CountingOccurrencesOfOneCharacter countingOccurrencesOfOneCharacter;

    @Test
    public void testCountingOccurrencesOfChar_e() {
        String repository = "Joe Biden foi eleito como o novo presidente dos Estados Unidos da America, para 2021";
        countingOccurrencesOfOneCharacter = new CountingOccurrencesOfOneCharacter();
        Long howManyLetterE = countingOccurrencesOfOneCharacter.countingOccurrencesOf(repository, 'e');
        Assertions.assertThat(howManyLetterE).isEqualTo(8);
    }

    @Test
    public void testCountingOccurrencesOfChar_a() {
        String repository = "Joe Biden foi eleito como o novo presidente dos Estados Unidos da America, para 2021";
        countingOccurrencesOfOneCharacter = new CountingOccurrencesOfOneCharacter();
        Long howManyLetterE = countingOccurrencesOfOneCharacter.countingOccurrencesOf(repository, 'a');
        Assertions.assertThat(howManyLetterE).isEqualTo(5);
    }
}