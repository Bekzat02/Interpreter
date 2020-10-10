package com.company;

import java.util.Stack;

public class Evaluate implements Expression{
    Expression evaluate;

    public Evaluate(String expression) {
        Stack<Expression> expressions=new Stack<>();
        for(String s : expression.split("\\D")){
            expressions.push(new Number(Integer.parseInt(s)));
        }
        for(String s: expression.split("\\d")){
            if(s.contains("*")){
                expressions.push(new Multiplication(expressions.pop(), expressions.pop()));
            }
            else if(s.equals("-")&&!expressions.contains("*")) {
                expressions.push(new Substraction(expressions.pop(), expressions.pop()));
            }
            else if(s.equals("+")&&!expressions.contains("*")){
                expressions.push(new Addition(expressions.pop(), expressions.pop()));
            }

        }
        evaluate =expressions.pop();
    }

    @Override
    public int interpret(Expression context) {
        return evaluate.interpret(context);
    }
}

