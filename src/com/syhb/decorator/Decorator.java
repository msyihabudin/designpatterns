package com.syhb.decorator;

public class Decorator implements MyHome {

    private MyHome myHome;

    Decorator(MyHome myHome) {
        this.myHome = myHome;
    }

    public void draw() {
        myHome.draw();
    }

}
