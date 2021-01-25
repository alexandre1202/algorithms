package br.com.aab.interviewquestions;

public class NumberInverter {
    private int number;
    public NumberInverter(int number) {
        this.number = number;
    }

    public int exec() {
        int a = 0;
        int b;
        do {
            b = this.number % 10;
            a = a * 10 + b;
            this.number /= 10;
        } while(this.number > 0);
        return a;
    }
}
