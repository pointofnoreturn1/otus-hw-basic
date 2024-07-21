package io.vaku;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
    }

    private static void printStringNTimes(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    private static void sumElementBiggerThanFive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    private static void fillArrayWithN(int n, int[] arr) {
        Arrays.fill(arr, n);
    }

    private static int[] incrementArrayElementsByN(int n, int[] arr) {
        return Arrays.stream(arr).map(it -> it + n).toArray();
    }

    private static void findWhichPartIsBigger(int[] arr) {
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

    private static int[] sumArraysIntoOne(int[]... arrays) {
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

    private static void findIfSumOfElementsEqualInTwoParts(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int leftPartSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            leftPartSum += arr[i];

            if (sum - leftPartSum == leftPartSum) {
                System.out.println("Точка находится между элементами с индексами " + i + " и " + (i + 1));
            }
        }
    }

    private static boolean checkIfElementsOrdered(int[] arr, boolean asc) {
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

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
