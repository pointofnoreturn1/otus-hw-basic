package io.vaku;

public class Cat extends Animal {

    public Cat(String name, double runSpeed, double stamina) {
        super(name, runSpeed, -1, stamina, -1);
    }

    @Override
    public double swim(int distance) {
        System.out.println("Кошки не умеют плавать");
        return -1;
    }

    @Override
    public void info() {
        System.out.println("Кошка по имени " + name);
        System.out.println("Скорость бега: " + runSpeed + "м/с");
        System.out.println("Выносливость: " + stamina);
    }
}
