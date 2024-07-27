package io.vaku;

public class Main {
    public static void main(String[] args) {

    }

    private static int sumOfPositiveElements(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }

    private static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void nullDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                    array[i][array.length - i - 1] = 0;
                }
            }
        }
    }

    private static int findMax(int[][] array) {
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max = Math.max(max, array[i][j]);
            }
        }

        return max;
    }

    private static int sumSecondRow(int[][] array) {

        if (array.length < 2) {
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 1) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }
}
