package br.com.aab.tallerinterview.mariano;

import java.util.Arrays;

public class StringValueChange {
    public static void main(String[] args) {
        String name = "";
        changeToHomer(name);
        System.out.println("name = " + name);
    }

    static void changeToHomer(String name) {
        name = "Homer";
    }
}
