package com.syhb.chain;

class Numbers {

    private int number1;
    private int number2;

    private String calculation;

    Numbers(int number1, int number2, String calculation) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculation = calculation;
    }

    int getNumber1() {
        return number1;
    }

    int getNumber2() {
        return number2;
    }

    String getCalculation() {
        return calculation;
    }
}
