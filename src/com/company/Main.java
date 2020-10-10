package com.company;

public class Main {

    public static void main(String[] args) {
        String expression="1+2-3*4*5";
        Expression parser=new Evaluate(expression);
        System.out.println(parser.interpret(parser));
    }
}
