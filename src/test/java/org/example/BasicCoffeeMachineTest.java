package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCoffeeMachineTest {

    @Test
    void makeEspresso() {
    }

    @Test
    void makeAmericano() {
    }

    @Test
    public void testBasicCoffeeMachine() {
        BasicCoffeeMachine machine = new BasicCoffeeMachine();
        machine.addWater(200);
        machine.addCoffee(50);
        machine.makeEspresso();
        machine.emptyWasteBin();

        assertEquals(0, machine.waterCapacity);
        assertEquals(28, machine.coffeeCapacity);
        assertEquals(22, machine.wasteBinCapacity);

        machine.addWater(200);
        machine.addCoffee(50);
        machine.makeAmericano();
        machine.emptyWasteBin();

        assertEquals(0, machine.waterCapacity);
        assertEquals(6, machine.coffeeCapacity);
        assertEquals(44, machine.wasteBinCapacity);
    }
}