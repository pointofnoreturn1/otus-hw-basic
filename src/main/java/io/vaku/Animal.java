package io.vaku;

public abstract class Animal {
    public String name;
    public double runSpeed;
    public double swimSpeed;
    public double stamina;
    public int runEnergyConsumption;

    public Animal(String name, double runSpeed, double swimSpeed, double stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
        this.runEnergyConsumption = 1;
    }

    public abstract double run(int distance);

    public abstract double swim(int distance);

    public abstract void info();

    protected boolean checkStamina(double energy) {
        return stamina - energy > 0;
    }
}
