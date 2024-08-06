package io.vaku;

public abstract class Animal {
    protected String name;
    protected double runSpeed;
    protected double swimSpeed;
    protected double stamina;
    protected int runEnergyConsumption;
    protected int swimEnergyConsumption;

    public Animal(String name, double runSpeed, double swimSpeed, double stamina, int swimEnergyConsumption) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
        this.runEnergyConsumption = 1;
        this.swimEnergyConsumption = swimEnergyConsumption;
    }

    public double run(int distance) {
        double energyConsumption = runEnergyConsumption * distance;

        if (checkStamina(energyConsumption)) {
            System.out.println(name + " пробежала " + distance + "м со скоростью " + runSpeed + "м/с");
            stamina = stamina - energyConsumption;
            return distance / runSpeed;
        } else {
            System.out.println("Животное устало");
            return -1;
        }
    }

    public double swim(int distance) {
        double energyConsumption = swimEnergyConsumption * distance;

        if (checkStamina(energyConsumption)) {
            System.out.println(name + " проплыла " + distance + "м со скоростью " + runSpeed + "м/с");
            stamina = stamina - energyConsumption;
            return distance / runSpeed;
        } else {
            System.out.println("Животное устало");
            return -1;
        }
    }

    public abstract void info();

    protected boolean checkStamina(double energy) {
        return stamina - energy > 0;
    }
}
