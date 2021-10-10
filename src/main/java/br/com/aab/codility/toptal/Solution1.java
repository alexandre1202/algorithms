package br.com.aab.codility.toptal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
   public static void main(String[] args) {
      Solution1 solution1 = new Solution1();
//      System.out.println("solution1.solution(We test coders. Give us a try?) = " + solution1.solution("We test " + "coders. Give us a try?"));
      System.out.println("solution1.solution(Forget CVS..Save time . x x) = "
                                 + solution1.solution("Forget  CVs..Save time . x x"));
   }

   public int solution(String S) {
      final String[] sentences = S.split("[\\.|!|\\?|:]");
      final List<String> part1 = new ArrayList<>();
      for (int i = 0; i < sentences.length; i++) {
         if (sentences[i].trim().length() > 0) {
            part1.add(sentences[i].trim());
         }
      }

      List<Integer> qtdWordsInSentence =
              part1.stream().filter(e -> e.trim().length() > 0).mapToInt(sentence -> {
                 String[] elements = sentence.split(" ");
                 int count = 0;
                 for (int i = 0; i < elements.length; i++) {
                    if (elements[i].trim().length() > 0) {
                       count++;
                    }
                 }
                 return count;
              }).boxed().collect(Collectors.toList());
      Collections.sort(qtdWordsInSentence);
      return qtdWordsInSentence.get(qtdWordsInSentence.size()-1);
   }
}
