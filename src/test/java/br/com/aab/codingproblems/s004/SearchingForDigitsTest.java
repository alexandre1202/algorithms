package br.com.aab.codingproblems.s004;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static br.com.aab.codingproblems.s004.SearchingForDigits.*;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SearchingForDigitsTest {

    @Test
    public void testContainAnyDigits() {
        String params = "149782314987131342987";
        assertThat(containAnyDigits(params)).isEqualTo(TRUE);
    }

    @Test
    public void testDoesNotContainOnlyDigits() {
        String params = "dsflkhasflkjh14978231498713134298ººº7asdifhsalkjfh1239y";
        assertThat(containAnyDigits(params)).isEqualTo(FALSE);
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