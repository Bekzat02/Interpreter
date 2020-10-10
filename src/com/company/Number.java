package com.company;

public class Number implements Expression{
    public int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Expression context) {
        return number;
    }
}
