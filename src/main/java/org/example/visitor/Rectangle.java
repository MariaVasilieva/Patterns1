package org.example.visitor;

public class Rectangle implements Shape {
    double width;
    double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
