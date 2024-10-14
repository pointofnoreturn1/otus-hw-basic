package io.vaku;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private final Object mon = new Object();
    private String letter = "C";

    public static void main(String[] args) {
        Main main = new Main();
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(main::printA);
        executorService.execute(main::printB);
        executorService.execute(main::printC);

        executorService.shutdown();
    }

    private void printA() {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                while (!letter.equals("C")) {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("A");
                letter = "A";
                mon.notifyAll();
            }
        }
    }

    private void printB() {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                while (!letter.equals("A")) {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                letter = "B";
                mon.notifyAll();
            }
        }
    }

    private void printC() {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                while (!letter.equals("B")) {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("C");
                letter = "C";
                mon.notifyAll();
            }
        }
    }
}
