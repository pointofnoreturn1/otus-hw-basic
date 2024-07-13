package io.vaku;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5:");

        switch (sc.nextInt()) {
            case 1 -> greetings();
            case 2 -> checkSign(getRandomInt(), getRandomInt(), getRandomInt());
            case 3 -> selectColor();
            case 4 -> compareNumbers();
            case 5 -> addOrSubtractAndPrint(getRandomInt(), getRandomInt(), new Random().nextBoolean());
        }
    }

    private static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    private static void checkSign(int a, int b, int c) {
        System.out.println((a + b + c >= 0) ? "Сумма положительная" : "Сумма отрицательная");
    }

    private static void selectColor() {
        int data = 15;

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 3;
        int b = 5;

        System.out.println((a >= b) ? (a + " >= " + b) : (a + " < " + b));
    }

    private static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println(increment ? initValue + delta : initValue - delta);
    }

    private static int getRandomInt() {
       return new Random().nextInt(-50, 51);
    }
}
