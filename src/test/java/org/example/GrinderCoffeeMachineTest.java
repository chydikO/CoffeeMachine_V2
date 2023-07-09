package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrinderCoffeeMachineTest {

    @Test
    void addCoffeeBeans() {
    }

    @Test
    void makeEspresso() {
    }

    @Test
    void makeAmericano() {
    }
    @Test
    public void testGrinderCoffeeMachine() {
        GrinderCoffeeMachine machine = new GrinderCoffeeMachine();
        machine.addWater(200);
        machine.addCoffeeBeans(100);
        machine.makeEspresso();
        machine.emptyWasteBin();

        assertEquals(0, machine.waterCapacity);
        assertEquals(178, machine.coffeeCapacity);
        assertEquals(22, machine.wasteBinCapacity);
        assertEquals(178, machine.getCoffeeBeansCapacity());

        machine.addWater(200);
        machine.addCoffeeBeans(100);
        machine.makeAmericano();
        machine.emptyWasteBin();

        assertEquals(0, machine.waterCapacity);
        assertEquals(178, machine.coffeeCapacity);
        assertEquals(22, machine.wasteBinCapacity);
        assertEquals(178, machine.getCoffeeBeansCapacity());
    }
}