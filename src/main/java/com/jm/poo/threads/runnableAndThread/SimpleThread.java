package com.jm.poo.threads.runnableAndThread;

import java.util.Random;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        long extraTime = (new Random().nextInt(1000) + 9200);
        long timeout = System.currentTimeMillis() + extraTime;
        System.out.println("Timeout for " + Thread.currentThread().getName() + " " + extraTime + " ms");

        int total = 0;

        while (timeout > System.currentTimeMillis()) {
            try {
                total += new Random().nextInt(500);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(" total from simple (" + Thread.currentThread().getName() + "):" + total);
    }
}
