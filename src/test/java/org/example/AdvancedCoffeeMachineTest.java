package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCoffeeMachineTest {

    @Test
    void setMilkCapacity() {
    }

    @Test
    void getMilkCapacity() {
    }

    @Test
    void addMilk() {
    }

    @Test
    void makeEspresso() {
    }

    @Test
    void makeAmericano() {
    }

    @Test
    void makeLatte() {
    }

    @Test
    void makeCappuccino() {
    }

    @Test
    public void testAdvancedCoffeeMachine() {
        AdvancedCoffeeMachine machine = new AdvancedCoffeeMachine();
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
    }

}