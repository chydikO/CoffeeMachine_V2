package org.example;

public abstract class CoffeeMachine {
    protected int coffeeCapacity;
    protected int waterCapacity;
    protected int wasteBinCapacity;

    public CoffeeMachine(int coffeeCapacity, int waterCapacity, int wasteBinCapacity) {
        this.coffeeCapacity = coffeeCapacity;
        this.waterCapacity = waterCapacity;
        this.wasteBinCapacity = wasteBinCapacity;
    }

    public void addWater(int amount) {
        if (waterCapacity + amount > waterCapacity) {
            throw new RuntimeException("Water capacity exceeded");
        }
        waterCapacity += amount;
    }

    public void addCoffee(int amount) {
        if (coffeeCapacity + amount > coffeeCapacity) {
            throw new RuntimeException("Coffee capacity exceeded");
        }
        coffeeCapacity += amount;
    }

    public void emptyWasteBin() {
        wasteBinCapacity = 0;
    }

    public abstract void makeEspresso();
    public abstract void makeAmericano();
}