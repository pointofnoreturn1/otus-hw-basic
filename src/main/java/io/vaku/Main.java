package io.vaku;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

    }

    private static void method1(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    private static int method2(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    private static void method3(int n, int[] arr) {
        Arrays.fill(arr, n);
    }

    private static int[] method4(int n, int[] arr) {
        return Arrays.stream(arr).map(it -> it + n).toArray();
    }

    private static void method5(int[] arr) {
        int sumLeftHalf = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumLeftHalf += arr[i];
        }

        int sumRightHalf = 0;
        for (int i =  arr.length / 2; i < arr.length ; i++) {
            sumRightHalf += arr[i];
        }

        System.out.println(sumLeftHalf > sumRightHalf ? "Left" : "Right");
    }

    private static int[] methodHard1(int[]... arrays) {
        int[] maxLengthArr = Arrays.stream(arrays).max(Comparator.comparingInt(it -> it.length)).get();

        for (int[] arr : arrays) {
            if (maxLengthArr != arr) {
                for (int i = 0; i < arr.length; i++) {
                    maxLengthArr[i] += arr[i];
                }
            }
        }

        return maxLengthArr;
    }

    private static void methodHard2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int[] left = new int[i + 1];
            int[] right = new int[arr.length - i - 1];

            for (int j = 0; j < i + 1; j++) {
                left[j] = arr[j];
            }

            for (int k = 0; k < right.length; k++) {
                right[k] = arr[k + i + 1];
            }

            if (Arrays.stream(left).sum() == Arrays.stream(right).sum()) {
                System.out.println("Точка находится между элементами с индексами " + i + " и " + (i + 1));
            }
        }
    }

    private static boolean methodHard3(int[] arr, boolean asc) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (asc) {
                if (arr[i] >= arr[i + 1])
                    return false;
            } else {
                if (arr[i] <= arr[i + 1])
                    return false;
            }
        }

        return true;
    }

    private static void methodHard4(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
