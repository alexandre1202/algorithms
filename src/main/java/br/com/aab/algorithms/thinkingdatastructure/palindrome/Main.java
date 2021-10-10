package br.com.aab.algorithms.thinkingdatastructure.palindrome;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("<<<<< Palindrome with Array >>>>>");
        System.out.println(new Main().isPalindrome("dummy"));
        System.out.println(new Main().isPalindrome("Natan"));
        System.out.println(new Main().isPalindrome("I did did I"));
        System.out.println(new Main().isPalindrome("COVID19"));
        System.out.println("---------------------------------\n\n");

        System.out.println("<<<<< Palindrome with LinkedList >>>>>");
        System.out.println(new Main().isPalondromeWithLinkedList("Natan"));
        System.out.println(new Main().isPalondromeWithLinkedList("I did did I"));
        System.out.println(new Main().isPalondromeWithLinkedList("COVID19"));
        System.out.println("---------------------------------");

        System.out.println("<<<<< Palindrome with With StringBuffer >>>>>");
        System.out.println(new Main().isPalindromeWithStringBuffer("Natan"));
        System.out.println(new Main().isPalindromeWithStringBuffer("I did did I"));
        System.out.println(new Main().isPalindromeWithStringBuffer("COVID19"));
        System.out.println("---------------------------------");

        double number1 = 5;
        double number2 = 10;
        System.out.println("number1 % number2 = " + number1 % number2);
        System.out.println("number1 / number2 = " + number1 / number2);

    }

    private boolean isPalindrome(String palindrome) {
        long begin = System.currentTimeMillis();
        char[] chars = palindrome.toLowerCase().toCharArray();
        int i1 = 0;
        int i2 = chars.length-1;
        while (i2 > i1) {
            if (chars[i2] != chars[i1]) {
                this.showTime(begin, palindrome);
                return false;
            }
            ++i1;
            --i2;
        }
        this.showTime(begin, palindrome);
        return true;
    }

    private boolean isPalondromeWithLinkedList(String str) {
        long begin = System.currentTimeMillis();
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
                this.showTime(begin, str);
                return false;
            }
        }
        this.showTime(begin, str);
        return true;
    }

    public boolean isPalindromeWithStringBuffer(String str) {
        long begin = System.currentTimeMillis();
        str = str.toLowerCase();
        boolean result = str.equals(new StringBuffer(str).reverse().toString());
        this.showTime(begin, str);
        return result;
    }

    private void showTime(Long begin, String input) {
        System.out.printf("elapsed time for palindrome of [%s] is [%d] ms\n",
                input,
                (System.currentTimeMillis() - begin));
    }
}
