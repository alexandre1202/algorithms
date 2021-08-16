package br.com.aab.tallerinterview.mariano;

import java.util.Arrays;

public class Example2Reference {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Homer ");
        addSurrName(name);
        System.out.println("name = " + name.toString());

        StringBuffer stringBuffer = new StringBuffer("Alex");
        addLastName(stringBuffer);
        System.out.println("stringBuffer = " + stringBuffer);

        String kaptcha = "Hi world";
        kaptcha.replace("Hi", "Hey");
        System.out.println("kaptcha = " + kaptcha);
    }

    static void addSurrName(StringBuilder name) {
        name.append(" Simpson");
    }

    static void addLastName(StringBuffer stringBuffer) {
        stringBuffer.append("andre");
    }
}
