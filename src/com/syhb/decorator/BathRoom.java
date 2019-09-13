package com.syhb.decorator;

public class BathRoom extends Decorator {

    BathRoom(MyHome myHome) {
        super(myHome);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("BathRoom");
    }
}
