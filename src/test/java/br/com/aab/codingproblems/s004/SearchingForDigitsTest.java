package br.com.aab.codingproblems.s004;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static br.com.aab.codingproblems.s004.SearchingForDigits.*;
import static java.lang.Boolean.TRUE;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SearchingForDigitsTest {

    @Test
    public void testContainAnyDigits() {
        String params = "dsflkhasflkjh149782314987131342987asdifhsalkjfh1239y";
        assertThat(containAnyDigits(params)).isEqualTo(TRUE);
    }

    @Test
    public void testContainOnlyDigits() {
        String params = "9742934792384";
        assertThat(containOnlyDigits(params)).isEqualTo(TRUE);
    }

    @Test
    public void testContainOnlyAlphaNumeric() {
        String params = "974293adlfkjasldfj4792384ADSAF";
        assertThat(containOnlyAlphaNumeric(params)).isEqualTo(TRUE);
    }

    @Test
    public void testContainOnlyNotAlphaNumeric() {
        String params = "çáóíêîâ";
        assertThat(containOnlyNotAlphaNumeric(params)).isEqualTo(TRUE);
    }

    @Test
    public void testDontContainWhiteSpace() {
        String params = "alexandreantoniobarbosa";
        assertThat(dontContainWhiteSpace(params));
    }
}