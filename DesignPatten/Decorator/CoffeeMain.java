package com.DSA.DesignPatten.Decorator;


//Decorator Pattern allows behavior to be added to
// individual objects dynamically by wrapping them in decorator classes that implement the same interface.

/*Spring Boot Example (Very Important)

One of the most common real-world examples is Java I/O.

FileInputStream fis = new FileInputStream("data.txt");

BufferedInputStream bis =
        new BufferedInputStream(fis);

DataInputStream dis =
        new DataInputStream(bis);

Here:

FileInputStream
      |
BufferedInputStream
      |
DataInputStream

Each class adds extra functionality without changing the original stream.*/

//here, it uses composition not inheritance to add new behavior to the coffee object without modifying its structure.
public class CoffeeMain {
    public static void main(String[] args) {
        // Create a basic coffee
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " Cost: " + basicCoffee.getCost());

        // Decorate with milk
        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println(milkCoffee.getDescription() + " Cost: " + milkCoffee.getCost());

        // Decorate with sugar
        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription() + " Cost: " + sugarMilkCoffee.getCost());
    }
}
