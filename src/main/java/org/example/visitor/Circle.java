package org.example.visitor;

public class Circle implements Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
