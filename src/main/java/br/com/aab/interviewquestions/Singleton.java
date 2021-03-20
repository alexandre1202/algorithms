package br.com.aab.interviewquestions;

public class Singleton {
    private Singleton() {}

    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() { return SingletonHelper.INSTANCE; }
}
