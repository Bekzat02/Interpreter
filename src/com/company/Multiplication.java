package com.company;

public class Multiplication extends Addition{

    public Multiplication(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight);
    }

    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context)*expressionRight.interpret(context);
    }
}
