package br.com.aab.effective.javaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Wordlist {
    public static void main(String[] args) {
        addStringsToTreeSet();
    }

    static void addStringsToTreeSet() {
        System.out.println("addStringsToTreeSet()");
        TreeSet<String> treeSet = new TreeSet<>();
        String[] names = {"Gustavo", "Chicao", "Lully", "Alexandre", "Gabriela"};
        System.out.println("String[] names  = " + Arrays.toString(names));
        Collections.addAll(treeSet, names);
        System.out.println("TreeSet<String> = " + treeSet);
    }
}
