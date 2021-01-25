package br.com.aab.codingproblems.s023;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class IdentingWords {

    private List<String> listOfWords = new ArrayList<>();

    public IdentingWords(List<String> words) {
        this.listOfWords = words;
    }

    public List<String> getIdentedWordsBySize() {
        return this.listOfWords.stream()
                .map(l -> String.format("%"+ l.length() + "s", " ") + l)
                .collect(toList());
    }
}
