package com.syhb.decorator;

public class LivingRoom extends Decorator {

    LivingRoom(MyHome myHome) {
        super(myHome);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Living room");
    }
}
