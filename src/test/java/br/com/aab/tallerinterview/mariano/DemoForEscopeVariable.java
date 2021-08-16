package br.com.aab.tallerinterview.mariano;

public class DemoForEscopeVariable {
    final int MAX_VALUE;

    public DemoForEscopeVariable(int MAX_VALUE) {
        this.MAX_VALUE = MAX_VALUE;
    }

    public static void example(final int parameter) {
        //parameter = 4;
    }
}
