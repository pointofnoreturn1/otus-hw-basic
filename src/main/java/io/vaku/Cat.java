package io.vaku;

public class Cat extends Animal {

    public Cat(String name, double runSpeed, double stamina) {
        super(name, runSpeed, -1, stamina);
    }

    @Override
    public double run(int distance) {
        double energyConsumption = runEnergyConsumption * distance;

        if (checkStamina(energyConsumption)) {
            System.out.println("Кошка пробежала " + distance + "м со скоростью " + runSpeed + "м/с");
            stamina = stamina - energyConsumption;
            return distance / runSpeed;
        } else {
            System.out.println("Животное устало");
            return -1;
        }
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
