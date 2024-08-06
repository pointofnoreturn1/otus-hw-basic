package io.vaku;

public class Horse extends Animal {

    public Horse(String name, double runSpeed, double swimSpeed, double stamina) {
        super(name, runSpeed, swimSpeed, stamina, 4);
    }

    @Override
    public void info() {
        System.out.println("Лошадь по имени " + name);
        System.out.println("Скорость бега: " + runSpeed + "м/с");
        System.out.println("Скорость плавания: " + swimSpeed + "м/с");
        System.out.println("Выносливость: " + stamina);
    }
}
