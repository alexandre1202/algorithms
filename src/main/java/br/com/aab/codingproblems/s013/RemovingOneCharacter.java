package br.com.aab.codingproblems.s013;

import java.util.stream.Collectors;

public class RemovingOneCharacter {
    public String removingOneCharacterUsingReplaceAll(String words, char charToRemove) {
        return words.replaceAll(String.valueOf(charToRemove), "");
    }

    //FS is Functional Style
    public String removingOneCharacterUsingFS(String words, char charToRemove) {
        return words.chars()
                       .filter(c -> ((char)c) != charToRemove)
                       .mapToObj(c -> String.valueOf((char) c))
                       .collect(Collectors.joining());
    }
}
