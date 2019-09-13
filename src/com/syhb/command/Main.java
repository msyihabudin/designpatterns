package com.syhb.command;

public class Main {

    public static void main(String[] args) {
        Electronic newDevice = new Radio();

        RadioOn onCommand = new RadioOn(newDevice);
        Button onPressed = new Button(onCommand);
        onPressed.press();

        RadioOff offCommand = new RadioOff(newDevice);
        onPressed = new Button(offCommand);
        onPressed.press();

        RadioUp volUpCommand = new RadioUp(newDevice);
        onPressed = new Button(volUpCommand);
        onPressed.press();
        onPressed.press();

    }
}
