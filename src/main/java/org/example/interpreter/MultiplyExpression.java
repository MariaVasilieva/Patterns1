package org.example.interpreter;

public class MultiplyExpression implements Expression {
    private final Expression left;
    private final Expression right;
    public MultiplyExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
