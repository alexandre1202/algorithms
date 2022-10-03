package br.com.aab.interviewquestions;

public class MySingleton {
    private MySingleton() {}

    private static class MySingletonHelper {
        private static final MySingleton INSTANCE = new MySingleton();
    }

    public static MySingleton getInstance() { return MySingletonHelper.INSTANCE; }
}
