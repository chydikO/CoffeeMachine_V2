package org.example;

public class GrinderCoffeeMachine extends BasicCoffeeMachine {
    private int coffeeBeansCapacity;

    public GrinderCoffeeMachine() {
        super();
        this.coffeeBeansCapacity = 200;
    }

    public int getCoffeeBeansCapacity() {
        return coffeeBeansCapacity;
    }
    
    public void addCoffeeBeans(int amount) {
        if (coffeeBeansCapacity + amount > coffeeBeansCapacity) {
            throw new RuntimeException("Coffee beans capacity exceeded");
        }
        coffeeBeansCapacity += amount;
    }

    @Override
    public void makeEspresso() {
        if (coffeeBeansCapacity < 22 || waterCapacity < 30) {
            throw new RuntimeException("Insufficient coffee beans or water");
        }
        System.out.println("Grinding coffee beans");
        coffeeBeansCapacity -= 22;
        super.makeEspresso();
    }

    @Override
    public void makeAmericano() {
        if (coffeeBeansCapacity < 22 || waterCapacity < 100) {
            throw new RuntimeException("Insufficient coffee beans or water");
        }
        System.out.println("Grinding coffee beans");
        coffeeBeansCapacity -= 22;
        super.makeAmericano();
    }
}