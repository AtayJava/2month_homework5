package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(4, true);
        CountDownLatch countDownLatch = new CountDownLatch(100);

        System.out.println("Касса открылась");

        for (int i = 1; i <= 100; i++) {
            new PassengerThread("Пассажир " + i, semaphore, countDownLatch).start();

        }
    }
}
