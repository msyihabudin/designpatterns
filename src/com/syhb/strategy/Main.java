package com.syhb.strategy;

public class Main {

    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal bird = new Bird();

        System.out.println("Horse: " + horse.tryToFly());
        System.out.println("Bird: " + bird.tryToFly());

        horse.setFlying(new ItFlys());

        System.out.println("Horse: " + horse.tryToFly());

    }
}
