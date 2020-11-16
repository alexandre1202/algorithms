package br.com.aab.codingproblems.s001;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CountingDuplicatesCharsTest {

    private CountingDuplicatesChars countingDuplicatesChars;
    private String params = "eu quero estudar, quero aplicar e quero produzir com qualidade";

    @Before
    public void setStringToCountingDuplicatesChars() {
        countingDuplicatesChars = new CountingDuplicatesChars(params);
    }

    @Test
    public void testCount1IsNotNull() {
        Map<Character, Long> map = countingDuplicatesChars.count1();
        assertThat(map).isNotNull();
    }

    @Test
    public void testCount1WithLetterE() {
        Map<Character, Long> map = countingDuplicatesChars.count1();
        assertThat(map).extractingByKey('e').isEqualTo(7L);
    }

    @Test
    public void testCount2IsNotNull() {
        Map<Character, Long> map = countingDuplicatesChars.count2();
        assertThat(map).isNotNull();
    }

    @Test
    public void testCount2WithLetterE() {
        Map<Character, Long> map = countingDuplicatesChars.count2();
        assertThat(map).extractingByKey('a').isEqualTo(5L);
    }

    @Test
    public void testCount3WithLetterO() {
        Map<Character, Long> map = countingDuplicatesChars.count3WithStream();
        assertThat(map).extractingByKey('o').isEqualTo(5L);
    }

    @Test
    public void testCount3WithLetter0UsingStream() {
        Map<Character, Long> map = countingDuplicatesChars.count3WithoutStream();
        assertThat(map).extractingByKey('o').isEqualTo(5L);
    }
}