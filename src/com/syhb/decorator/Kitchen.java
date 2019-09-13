package com.syhb.decorator;

public class Kitchen extends Decorator {

    Kitchen(MyHome myHome) {
        super(myHome);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Kitchen");
    }

}
