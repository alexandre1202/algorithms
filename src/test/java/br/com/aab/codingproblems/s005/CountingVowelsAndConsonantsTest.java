package br.com.aab.codingproblems.s005;

import br.com.aab.codingproblems.s001.Pair;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static br.com.aab.codingproblems.s005.CountingVowelsAndConsonants.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CountingVowelsAndConsonantsTest {
    private CountingVowelsAndConsonants countingVowelsAndConsonants;
    // 14 vowels, 19 consonants
    private final String param = " ... Illinois Mathematics & Science Academy ... ";

    @Before
    public void init() {
        countingVowelsAndConsonants = new CountingVowelsAndConsonants();
    }

    @Test
    public void testCountVowelsAndConsonantsV1() {
        Pair<Long, Long> vowelsAndConsonantsPair = countVowelsAndConsonantsV1(param);
        assertThat(vowelsAndConsonantsPair).isNotNull();
        assertThat(vowelsAndConsonantsPair.getVowels()).isEqualTo(14);
        assertThat(vowelsAndConsonantsPair.getConsonants()).isEqualTo(19);
    }

    @Test
    public void testCountVowelsAndConsonantsV2() {
        Pair<Long, Long> vowelsAndConsonantsPair = countVowelsAndConsonantsV2(param);
        assertThat(vowelsAndConsonantsPair).isNotNull();
        assertThat(vowelsAndConsonantsPair.getVowels()).isEqualTo(14);
        assertThat(vowelsAndConsonantsPair.getConsonants()).isEqualTo(19);
    }

    @Test
    public void testCountVogaisEConsoantes() {
        PairVC<Long, Long> actual = countVogaisEConsoantes(param);
        assertThat(actual.getVogais()).isEqualTo(14);
        assertThat(actual.getConsoantes()).isEqualTo(19);
    }
}