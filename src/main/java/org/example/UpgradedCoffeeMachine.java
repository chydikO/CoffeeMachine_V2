package org.example;

public class UpgradedCoffeeMachine extends AdvancedCoffeeMachine {
    public UpgradedCoffeeMachine() {
        super();
    }

    @Override
    public void makeLatte() {
        if (coffeeCapacity < 22 || waterCapacity < 30 || getMilkCapacity() < 50) {
            throw new RuntimeException("Insufficient coffee, water, or milk");
        }
        System.out.println("Making latte");
        coffeeCapacity -= 22;
        waterCapacity -= 30;
        setMilkCapacity(getMilkCapacity() - 50);
        wasteBinCapacity += 22;
    }

    @Override
    public void makeCappuccino() {
        if (coffeeCapacity < 22 || waterCapacity < 30 || getMilkCapacity() < 50) {
            throw new RuntimeException("Insufficient coffee, water, or milk");
        }
        System.out.println("Making cappuccino");
        coffeeCapacity -= 22;
        waterCapacity -= 30;
        setMilkCapacity(getMilkCapacity() - 50);
        wasteBinCapacity += 22;
    }

    public void makeLatteWithExtraMilk() {
        if (coffeeCapacity < 22 || waterCapacity < 30 || getMilkCapacity() < 100) {
            throw new RuntimeException("Insufficient coffee, water, or milk");
        }
        System.out.println("Making latte with extra milk");
        coffeeCapacity -= 22;
        waterCapacity -= 30;
        setMilkCapacity(getMilkCapacity() - 100);
        wasteBinCapacity += 22;
    }

    public void makeCappuccinoWithChocolate() {
        if (coffeeCapacity < 22 || waterCapacity < 30 || getMilkCapacity() < 50) {
            throw new RuntimeException("Insufficient coffee, water, or milk");
        }
        System.out.println("Making cappuccino with chocolate");
        coffeeCapacity -= 22;
        waterCapacity -= 30;
        setMilkCapacity(getMilkCapacity() - 50);
        wasteBinCapacity += 22;
    }
}