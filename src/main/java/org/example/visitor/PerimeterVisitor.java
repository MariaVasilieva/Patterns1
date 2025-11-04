package org.example.visitor;

public class PerimeterVisitor implements Visitor {

    @Override
    public void visit(Circle circle) {
        double p = 2*Math.PI * circle.radius;
        System.out.println("P = "+p);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double p = 2*(rectangle.height + rectangle.width);
        System.out.println("P = "+p);
    }
}
