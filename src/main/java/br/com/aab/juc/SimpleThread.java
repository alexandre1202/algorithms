package br.com.aab.juc;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleThread {
    private int counter;
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) {
        new SimpleThread().exec();
    }

    private void exec() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) atomicInteger.getAndAdd(i); //counter++;
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) atomicInteger.getAndAdd(i); //counter++;
            }
        });

        t1.start();
        t2.start();
        System.out.println("counter = " + counter);
    }
}
