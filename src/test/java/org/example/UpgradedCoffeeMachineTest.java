package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpgradedCoffeeMachineTest {

    @Test
    void makeLatte() {
    }

    @Test
    void makeCappuccino() {
    }

    @Test
    void makeLatteWithExtraMilk() {
    }

    @Test
    void makeCappuccinoWithChocolate() {
    }

    @Test
    public void testUpgradedCoffeeMachine() {
        UpgradedCoffeeMachine machine = new UpgradedCoffeeMachine();
        machine.addWater(200);
        machine.addCoffee(50);
        machine.addMilk(100);
        machine.makeLatte();
        machine.emptyWasteBin();

        assertEquals(0, machine.waterCapacity);
        assertEquals(28, machine.coffeeCapacity);
        assertEquals(22, machine.wasteBinCapacity);
        assertEquals(50, machine.getMilkCapacity());

        machine.addWater(200);
        machine.addCoffee(50);
        machine.addMilk(100);
        machine.makeCappuccino();
        machine.emptyWasteBin();

        assertEquals(0, machine.waterCapacity);
        assertEquals(28, machine.coffeeCapacity);
        assertEquals(22, machine.wasteBinCapacity);
        assertEquals(50, machine.getMilkCapacity());

        machine.addWater(200);
        machine.addCoffee(50);
        machine.addMilk(150);
        machine.makeLatteWithExtraMilk();
        machine.emptyWasteBin();

        assertEquals(0, machine.waterCapacity);
        assertEquals(28, machine.coffeeCapacity);
        assertEquals(22, machine.wasteBinCapacity);
        assertEquals(0, machine.getMilkCapacity());

        machine.addWater(200);
        machine.addCoffee(50);
        machine.addMilk(100);
        machine.makeCappuccinoWithChocolate();
        machine.emptyWasteBin();

        assertEquals(0, machine.waterCapacity);
        assertEquals(28, machine.coffeeCapacity);
        assertEquals(22, machine.wasteBinCapacity);
        assertEquals(50, machine.getMilkCapacity());
    }
}