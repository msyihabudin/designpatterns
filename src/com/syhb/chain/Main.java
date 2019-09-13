package com.syhb.chain;

public class Main {

    public static void main(String[] args) {
        Chain calc1 = new AddNumbers();
        Chain calc2 = new SubtractNumbers();
        Chain calc3 = new MultNumbers();
        Chain calc4 = new DivideNumbers();

        calc1.setNextChain(calc2);
        calc2.setNextChain(calc3);
        calc3.setNextChain(calc4);

        Numbers request = new Numbers(4,2,"mult");
        calc1.calculate(request);
    }

}
