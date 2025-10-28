package org.example.interpreter;

import java.util.Stack;
//"2 3 5 + *"
//{"2","3","5","+","*"}
//stack 16

public class Interpretator {
    public static Expression interpret(String expression) {
        String[] token = expression.split(" ");
        Stack<Expression> stack = new Stack<>();
        for (String s : token) {
            switch (s) {
                case "+" -> {
                    Expression right = stack.pop();
                    Expression left = stack.pop();
                    stack.push(new AddExpression(left, right));
                }
                case "-" -> {
                    Expression right = stack.pop();
                    Expression left = stack.pop();
                    stack.push(new SubtractExpression(left, right));
                }
                case "*" -> {
                    Expression right = stack.pop();
                    Expression left = stack.pop();
                    stack.push(new MultiplyExpression(left, right));
                }
                default -> {
                    if(s.matches("\\d+")){
                        stack.push(new NumberExpression(Integer.parseInt(s)));
                    }
                    else{
                       throw new IllegalArgumentException("Unknown symbol: " + s);
                    }
                }
            }
        }
        return stack.pop();
    }
}
