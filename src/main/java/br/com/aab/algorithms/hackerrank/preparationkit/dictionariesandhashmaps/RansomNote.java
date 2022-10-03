package br.com.aab.algorithms.hackerrank.preparationkit.dictionariesandhashmaps;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RansomNote {
    public void checkMagazine(List<String> magazine, List<String> note) {
        if ((Objects.isNull(magazine) || magazine.size()  == 0)
            || (Objects.isNull(note) || note.size() == 0)) {
            System.out.println("No");
            return;
        }

        Map<String, Long> mapMagazine = magazine.stream().collect(groupingBy(m -> m, counting()));
        int i = 0;
        while (i < note.size() - 1) {
            String n = note.get(i++);
            if (! mapMagazine.containsKey(n)) {
                System.out.println("No");
                return;
            } else {
                mapMagazine.compute(n, (k, v) -> --v);
                if (mapMagazine.get(n) < 0) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        List<String> magazine;
        List<String> note;

//        magazine = Arrays.asList("give", "me", "one", "grand", "today", "night");
//        note = Arrays.asList("give", "one", "grand", "today");
//        ransomNote.checkMagazine(magazine, note);

        magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        note = Arrays.asList("two", "times", "two", "is", "four");
        ransomNote.checkMagazine(magazine, note);

//        magazine = Arrays.asList("apgo", "clm", "w", "lxkvg",
//                "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo", "apgo", "w", "elo", "bg");
//        note = Arrays.asList("elo", "lxkvg", "bg", "mwz", "clm", "w");
//        ransomNote.checkMagazine(magazine, note);

    }
}
