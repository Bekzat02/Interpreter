package com.company;

public class Substraction extends Addition{
    public Substraction(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight);
    }

    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context)-expressionRight.interpret(context);
    }
}
