package br.com.aab.codingproblems.s003;

import java.util.regex.Pattern;

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
        String result = new String(letters);
        return result;
    }

    public String reverseWords() {

    }
}
