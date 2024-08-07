package io.vaku;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Barsik",30),
                new Cat("Pushok",40),
                new Cat("Ryzhik",50)
        };
        Plate plate = new Plate(100);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            cat.showInfo();
        }
    }
}
