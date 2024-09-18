package io.vaku;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        double[] arr1 = new double[100_000_000];
        long start1 = System.currentTimeMillis();
        count(arr1, 0, arr1.length);
        System.out.println("1 thread: " + (System.currentTimeMillis() - start1));

        double[] arr2 = new double[100_000_000];
        long start2 = System.currentTimeMillis();
        List<Thread> threads = List.of(
                new Thread(() -> count(arr2, 0, 24_999_999)),
                new Thread(() -> count(arr2, 25_000_000, 49_999_999)),
                new Thread(() -> count(arr2, 50_000_000, 74_999_999)),
                new Thread(() -> count(arr2, 75_000_000, arr2.length))
        );

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }
        System.out.println("4 threads: " + (System.currentTimeMillis() - start2));
    }

    private static void count(double[] arr, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
