# Coffee Machines

This repository contains a Java program that simulates different models of coffee machines. The program includes a hierarchy of classes, including an abstract base class, interfaces, and JUnit tests. It demonstrates the concepts of abstract classes and interfaces in Java.

## Task 1

The factory produces various models of coffee machines with different characteristics. The coffee machine is loaded with ground coffee and water, and the maximum load values depend on the model. The following amounts are required to make one cup of coffee:

- Espresso: 22g of ground coffee and 30ml of water.
- Americano: 22g of ground coffee and 100ml of water.

The used coffee is discarded into a waste bin, the capacity of which depends on the model.

The coffee machine can encounter various errors during operation:

- Absence of water.
- Absence of ground coffee.
- Waste bin overflow.

The coffee machine has the following buttons:

- Power on/off.
- Make espresso.
- Make americano.
- Clean waste bin.

## Task 2

After an upgrade, the factory started producing new coffee machines that allow making cappuccino and latte in addition to the previous functions. The machines have a built-in milk container, and the size of the container depends on the machine model.

An additional error has been introduced:

- Absence of milk.

New buttons have been added:

- Make latte.
- Make cappuccino.

The amount of milk used for making cappuccino and latte is specified during preparation. The amount of coffee and water consumed is the same as when making an espresso.

Test the new coffee machine models. All previous tests should pass successfully. Reuse the code from the previous task.

## Task 3

After another upgrade, the factory started producing coffee machines that can use both ground and unground coffee. The machine itself grinds the coffee. The size of the container for unground coffee depends on the model. After grinding, the coffee goes into the container for ground coffee and is then used for brewing.

To reduce costs, the marketing department decided to limit the functionality of these coffee machines. The machines can only make:

- Americano.
- Latte.

Test the new coffee machine model. All previous tests should pass successfully. New errors have been introduced:

- Absence of unground coffee.

## Instructions

To run the program and execute the tests, make sure you have Java and JUnit set up on your system. Follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/coffee-machines.git`
2. Navigate to the project directory: `cd coffee-machines`
3. Compile the Java classes: `javac *.java`
4. Run the JUnit tests: `java org.junit.runner.JUnitCore CoffeeMachineTest`

Ensure that all the tests pass successfully.

Feel free to explore and modify the code to meet your requirements.

**Note:** This readme file provides a general overview of the project. You may need to update and customize it based on your specific needs and project structure.

Enjoy your coffee! ☕️
