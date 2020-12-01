package com.kodilla;

public class Calculator {

    int numberA;
    int numberB;

    public Calculator (int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }
    public void addition(){
       int addResult = numberA + numberB;
       System.out.println(addResult + "\n");
    }
    public void substractionAB(){
        int subResult = numberA - numberB;
        System.out.println(subResult + "\n");
    }

    public void check(){
        System.out.println("Hula!");
    }

    public static void main (String[] args) {
        Calculator newCalculator = new Calculator(50, 20);
        newCalculator.addition();
        newCalculator.substractionAB();
        newCalculator.check();
    }
}
