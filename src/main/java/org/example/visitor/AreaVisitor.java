package org.example.visitor;

public class AreaVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.radius*circle.radius;
        System.out.println("Area: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.height * rectangle.width;
        System.out.println("Area: " + area);
    }
}
