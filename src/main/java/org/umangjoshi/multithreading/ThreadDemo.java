package org.umangjoshi.multithreading;

public class ThreadDemo{

    public static void main(String[] args) {
        CustomThread ct = new CustomThread();
        Thread t1 = new Thread(ct, "Thread-1");
        Thread t2 = new Thread(ct, "Thread-2");


        t1.start();
        t2.start();

    }
}

class CustomThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Current Iteration is %d, Thread - %s", i, Thread.currentThread().getName()));
        }
    }
}