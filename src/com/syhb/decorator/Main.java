package com.syhb.decorator;

public class Main {

    public static void main(String[] args) {

        MyHome myHome = new BedRoom(new LivingRoom(new Kitchen(new BathRoom(new Area(10, 9)))));
        myHome.draw();

    }
}
