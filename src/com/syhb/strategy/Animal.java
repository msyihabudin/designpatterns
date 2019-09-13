package com.syhb.strategy;

class Animal {

    Flys flying;

    String tryToFly(){
        return flying.fly();
    }

    void setFlying(Flys newFly){
        flying = newFly;
    }

}
