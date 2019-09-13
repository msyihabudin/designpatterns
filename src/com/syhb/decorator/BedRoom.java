package com.syhb.decorator;

public class BedRoom extends Decorator {

    BedRoom(MyHome myHome) {
        super(myHome);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Bedroom");
    }
}
