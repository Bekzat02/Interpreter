package com.company;

public class Addition implements Expression{
    public Expression expressionLeft;
    public Expression expressionRight;

    public Addition(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context)+expressionRight.interpret(context);
    }
}
