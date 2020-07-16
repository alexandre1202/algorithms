package br.com.aab.algorithms.thinkingdatastructure.palindrome;

import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {

    int number1 = 5;
    int number2 = 10;
    System.out.println("number1 % number2 = " + number1 % number2);
    System.out.println("number1 / number2 = " + number1 / number2);

    System.exit(0);

    System.out.println("<<<<< Palindrome with Array >>>>>");
    System.out.println(new Main().isPalindrome("Natan"));
    System.out.println(new Main().isPalindrome("I did did I"));
    System.out.println(new Main().isPalindrome("COVID19"));
    System.out.println("---------------------------------\n\n");

    System.out.println("<<<<< Palindrome with LinkedList >>>>>");
    System.out.println(new Main().isPalondromeWithLinkedList("Natan"));
    System.out.println(new Main().isPalondromeWithLinkedList("I did did I"));
    System.out.println(new Main().isPalondromeWithLinkedList("COVID19"));
    System.out.println("---------------------------------");
  }

  private boolean isPalindrome(String palindrome) {
    char[] chars = palindrome.toLowerCase().toCharArray();
    int i1 = 0;
    int i2 = chars.length-1;
    while (i2 > i1) {
      if (chars[i2] != chars[i1]) {
        return false;
      }
      ++i1;
      --i2;
    }
    return true;
  }

  private boolean isPalondromeWithLinkedList(String str) {
    LinkedList<Character> stack = new LinkedList<Character>();
    LinkedList<Character> queue = new LinkedList<Character>();
    String lowerCase = str.toLowerCase();
    for (int i = 0; i < lowerCase.length(); i++) {
      char charLC = lowerCase.charAt(i);
      if (charLC > 'a' && charLC < 'z') {
        stack.push(charLC);
        queue.addLast(charLC);
      }
    }

    while(!stack.isEmpty()) {
      if (!stack.poll().equals(queue.removeFirst())) {
        return false;
      }
    }

    return true;
  }
}
