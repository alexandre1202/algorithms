package br.com.aab.tallerinterview.mariano;

import java.util.Arrays;

class Simpson {
    String name;
}
public class ObjectReferenceExample {
    public static void main(String[] args) {
        Simpson simpson = new Simpson();
        transformIntoHomer(simpson);
        System.out.println("simpson.name = " + simpson.name);
    }

    static void transformIntoHomer(Simpson simpson) {
        simpson.name = "Homer";
    }
}
