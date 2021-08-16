package br.com.aab.juc;

public class SimpleThread {
    private int counter;
    public static void main(String[] args) {
        new SimpleThread().exec();
    }

    private void exec() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) counter++;
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) counter++;
            }
        });

        t1.start();
        t2.start();
        System.out.println("counter = " + counter);
    }
}
