package com.syhb.decorator;

public class Area implements MyHome {

    private int width;
    private int height;

    Area(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("My Home Area: "+ width +", "+ height);
    }

}
