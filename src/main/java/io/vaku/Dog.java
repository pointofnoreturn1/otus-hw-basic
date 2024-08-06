package io.vaku;

public class Dog extends Animal {

    public Dog(String name, double runSpeed, double swimSpeed, double stamina) {
        super(name, runSpeed, swimSpeed, stamina, 2);
    }

    @Override
    public void info() {
        System.out.println("Собака по имени " + name);
        System.out.println("Скорость бега: " + runSpeed + "м/с");
        System.out.println("Скорость плавания: " + swimSpeed + "м/с");
        System.out.println("Выносливость: " + stamina);
    }
}
