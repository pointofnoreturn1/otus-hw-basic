package io.vaku;

public class Horse extends Animal {

    private final int swimEnergyConsumption = 4;

    public Horse(String name, double runSpeed, double swimSpeed, double stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public double run(int distance) {
        double energyConsumption = runEnergyConsumption * distance;

        if (checkStamina(energyConsumption)) {
            System.out.println("Лошадь пробежала " + distance + "м со скоростью " + runSpeed + "м/с");
            stamina = stamina - energyConsumption;
            return distance / runSpeed;
        } else {
            System.out.println("Животное устало");
            return -1;
        }
    }

    @Override
    public double swim(int distance) {
        double energyConsumption = swimEnergyConsumption * distance;

        if (checkStamina(energyConsumption)) {
            System.out.println("Лошадь проплыла " + distance + "м со скоростью " + runSpeed + "м/с");
            stamina = stamina - energyConsumption;
            return distance / runSpeed;
        } else {
            System.out.println("Животное устало");
            return -1;
        }
    }

    @Override
    public void info() {
        System.out.println("Лошадь по имени " + name);
        System.out.println("Скорость бега: " + runSpeed + "м/с");
        System.out.println("Скорость плавания: " + swimSpeed + "м/с");
        System.out.println("Выносливость: " + stamina);
    }
}
