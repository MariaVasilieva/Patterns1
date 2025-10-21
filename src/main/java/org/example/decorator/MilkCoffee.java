package org.example.decorator;

public class MilkCoffee extends CoffeeDecorator{
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk ";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.5;
    }
}
