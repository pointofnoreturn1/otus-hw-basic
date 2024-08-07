package io.vaku;

public class Plate {
    private int maxFoodAmount;
    private int currentFoodAmount;

    public Plate(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount = maxFoodAmount;
    }

    public void increaseFood(int amount) {
        currentFoodAmount = Math.min(amount + currentFoodAmount, maxFoodAmount);
    }

    public boolean decreaseFood(int amount) {
        if (currentFoodAmount - amount < 0) {
            return false;
        }

        currentFoodAmount -= amount;
        return true;
    }
}