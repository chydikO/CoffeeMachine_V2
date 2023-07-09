package org.example;

public class BasicCoffeeMachine extends CoffeeMachine {
    public BasicCoffeeMachine() {
        super(100, 200, 500);
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
}