package br.com.aab.tallerinterview.mariano;

import java.util.ArrayList;
import java.util.List;

public class FinalArrayList {
    private final List foo;

    public FinalArrayList() {
        this.foo = new ArrayList();
    }

    public FinalArrayList(ArrayList<String> arrayList) {
        this.foo = arrayList;
    }

    public final int exec() {
        return 0;
    }

    public static void main(String[] args) {
        FinalArrayList finalArrayList = new FinalArrayList();
        finalArrayList.foo.stream().forEach(System.out::println);
    }
}
