package br.com.aab.codingproblems.s006;

public class CountingOccurrencesOfOneCharacter {
    public Long countingOccurrencesOf(String repository, Character key) {
        return repository.chars().filter(c -> ((char) c) == key).count();
    }
}
