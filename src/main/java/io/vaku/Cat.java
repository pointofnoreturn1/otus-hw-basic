package io.vaku;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate plate) {
        isFull = plate.decreaseFood(appetite);
    }

    public void showInfo() {
        System.out.println(isFull ? "Кот " + name + " сытый" : "Кот " + name + " голодный");
    }
}
