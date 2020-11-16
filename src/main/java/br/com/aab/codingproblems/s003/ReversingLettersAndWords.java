package br.com.aab.codingproblems.s003;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReversingLettersAndWords {

    private String params;
    private static final Pattern PATTERN = Pattern.compile(" +");

    public ReversingLettersAndWords(String params) {
        this.params = params;
    }

    public String reversingLetters() {
        char[] letters = this.params.toCharArray();
        char temp ;
        int paramsLength = this.params.length()-1;
        for (int i = 0; i < paramsLength; i++) {
            temp = letters[i];
            letters[i] = letters[paramsLength];
            letters[paramsLength--] = temp;
        }
        return new String(letters);
    }

    public String reverseWords() {
        String[] words = this.params.split(" ");
        String wordTemp = null;
        int wordLength = words.length - 1;
        for (int i = 0; i < wordLength; i++) {
            wordTemp = words[i];
            words[i] = words[wordLength];
            words[wordLength--] = wordTemp;
        }

        return Arrays.deepToString(words)
                       .replace(",", "")
                       .replace("[", "")
                       .replace("]", "");

    }

    //Functional way
    public String reverseWordsFunctional() {
        final Pattern PATTERN = Pattern.compile(" +");
        return PATTERN.splitAsStream(this.params)
                       .map(w -> new StringBuilder(w).reverse())
                       .collect(Collectors.joining());
    }

    public String reverseLettersV2() {
        return new StringBuilder(this.params).reverse().toString();
    }
}
