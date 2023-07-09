package org.example;

public class AdvancedCoffeeMachine extends CoffeeMachine {
    private int milkCapacity;

    public AdvancedCoffeeMachine() {
        super(100, 200, 500);
        this.milkCapacity = 200;
    }

    public void addMilk(int amount) {
        if (milkCapacity + amount > milkCapacity) {
            throw new RuntimeException("Milk capacity exceeded");
        }
        milkCapacity += amount;
    }

    @Override
    public void makeEspresso() {
        if (coffeeCapacity < 22 || waterCapacity < 30) {
            throw new RuntimeException("Insufficient coffee or water");
        }
        System.out.println("Making espresso");
        coffeeCapacity -= 22;
        waterCapacity -= 30;
        wasteBinCapacity += 22;
    }

    @Override
    public void makeAmericano() {
        if (coffeeCapacity < 22 || waterCapacity < 100) {
            throw new RuntimeException("Insufficient coffee or water");
        }
        System.out.println("Making americano");
        coffeeCapacity -= 22;
        waterCapacity -= 100;
        wasteBinCapacity += 22;
    }

    public void makeLatte() {
        if (coffeeCapacity < 22 || waterCapacity < 30 || milkCapacity < 50) {
            throw new RuntimeException("Insufficient coffee, water, or milk");
        }
        System.out.println("Making latte");
        coffeeCapacity -= 22;
        waterCapacity -= 30;
        milkCapacity -= 50;
        wasteBinCapacity += 22;
    }

    public void makeCappuccino() {
        if (coffeeCapacity < 22 || waterCapacity < 30 || milkCapacity < 50) {
            throw new RuntimeException("Insufficient coffee, water, or milk");
        }
        System.out.println("Making cappuccino");
        coffeeCapacity -= 22;
        waterCapacity -= 30;
        milkCapacity -= 50;
        wasteBinCapacity += 22;
    }
}