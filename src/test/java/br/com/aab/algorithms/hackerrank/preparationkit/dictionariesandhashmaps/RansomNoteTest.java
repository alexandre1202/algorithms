package br.com.aab.algorithms.hackerrank.preparationkit.dictionariesandhashmaps;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.BooleanAssert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RansomNoteTest {

    private RansomNote ransomNote = new RansomNote();

    @Test
    public void testCheckMagazineGiveMe() {
        List<String> magazine = Arrays.asList("give", "me", "one", "grand", "today", "night");
        List<String> note = Arrays.asList("give", "one", "grand", "today");
        //Assertions.assertThat(ransomNote.checkMagazine(magazine, note)).isEqualTo("Yes");
    }

    @Test
    public void testCheckMagazineTwoTimes() {
        List<String> magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        List<String> note = Arrays.asList("two", "times", "two", "is", "four");
        //Assertions.assertThat(ransomNote.checkMagazine(magazine, note)).isEqualTo("No");
    }

    @Test
    public void testCheckMagazineEloLxkvgBg() {
        List<String> magazine = Arrays.asList("apgo", "clm", "w", "lxkvg",
         "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo", "apgo", "w", "elo", "bg");
        List<String> note = Arrays.asList("elo", "lxkvg", "bg", "mwz", "clm", "w");
        //Assertions.assertThat(ransomNote.checkMagazine(magazine, note)).isEqualTo("Yes");

    }
}